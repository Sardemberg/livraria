package livraria.operations.livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.operations.BaseOperation;
import livraria.models.Livro;

public class Update extends BaseOperation {
    private Connection connection = null;

    public Update(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object process(Object object) {
        try {
            Livro livro = (Livro) object;
            this.updateLivro(livro);
        } catch (SQLException e) {
            System.out.println("Erro na atualização do livro: " + e);
            return false;
        }

        return true;
    }

    private void updateLivro(Livro livro) throws SQLException{
        String query = "update livros set nome = ?, lingua = ?, codigo = ?, ano = ?, autor = ? where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);

        stmt.setString(1, livro.getNome());
        stmt.setString(2, livro.getLingua());
        stmt.setString(3, livro.getCodigo());
        stmt.setInt(4, livro.getAno());
        stmt.setString(5, livro.getAutor());
        stmt.setInt(6, livro.getId());

        stmt.executeUpdate();
        System.out.println("Livro atualizado com sucesso!");
    }
    
}
