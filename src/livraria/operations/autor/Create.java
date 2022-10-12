/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations.autor;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import livraria.models.Autor;
import livraria.operations.BaseOperation;

/**
 *
 * @author lucas
 */
public class Create extends BaseOperation {
    private Connection connection = null;
    
    public Create(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object process(Object object) {
        Autor autor = (Autor) object;
        
        try {
            this.createAutor(autor);
            return true;
        } catch (SQLException e){
            System.out.println("Erro ao inserir dado: " + e);
        }
        
        return false;
    }
    
    private void createAutor(Autor autor) throws SQLException{
        String query = "insert into livros(nome, data_nasc, nacionalidade, biografia) values (?, ?, ?, ?)";

        PreparedStatement stmt = this.connection.prepareStatement(query);

        stmt.setString(1, autor.getNome());
        stmt.setDate(2, autor.getData_nasc());
        stmt.setString(3, autor.getNacionalidade());
        stmt.setString(4, autor.getBiografia());

        stmt.executeUpdate();

        System.out.println("Livro cadastrado com sucesso");
    }
}
