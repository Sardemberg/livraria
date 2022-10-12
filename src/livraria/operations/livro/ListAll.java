package livraria.operations.livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import livraria.operations.BaseOperation;
import livraria.models.Livro;


public class ListAll extends BaseOperation {
    private Connection connection = null;

    public ListAll(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object process(Object object) {
        ArrayList<Livro> results = null;

        try {
            results = this.ListAllLivros();
        } catch (SQLException e){
            System.out.println("Erro ao buscar livros: " + e);
        }

        return results;
    }

    private ArrayList<Livro> ListAllLivros() throws SQLException{
        String query = "select * from livros";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Livro> livros_results = null;

        while(rs.next()){
            Livro livro = new Livro();

            livro.setId(rs.getInt("id"));
            livro.setNome(rs.getString("nome"));
            livro.setCodigo(rs.getString("codigo"));
            livro.setLingua(rs.getString("lingua"));
            livro.setAno(rs.getInt("ano"));

            livros_results.add(livro);
        }

        return livros_results;
    }
}
