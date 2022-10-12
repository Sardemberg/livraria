package livraria.operations.livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.models.*;

import livraria.operations.BaseOperation;

public class Delete extends BaseOperation {
    public Connection connection = null;

    public Delete(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public Object process(Object params) {
        
        Livro livro = (Livro) params;

        try{
            this.deleteLivro(livro.getId());
        }catch(SQLException e){
            System.out.println("Erro ao deletar livro" + e);
            return false;
        }

        return true;
    }

    private void deleteLivro(int id) throws SQLException{
        String query = "delete from livros where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        stmt.setInt(1, id);

        stmt.executeUpdate();
        System.out.println("Livro deletado com sucesso!");
    }
}
