/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations.autor;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import livraria.models.Autor;
import livraria.operations.BaseOperation;

/**
 *
 * @author lucas
 */
public class ListAll extends BaseOperation {
    Connection connection = null;
    
    public ListAll(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object process(Object object) {
        ArrayList<Autor> autor_result = null;
        
        try {
            autor_result = this.ListAllAuthors();
        } catch(SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return autor_result;
    }
    
    private ArrayList<Autor> ListAllAuthors() throws SQLException{
        String query = "select * from autores";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Autor> autor_results = new ArrayList<Autor>();

        while(rs.next()){
            Autor autor = new Autor();

            autor.setId(rs.getInt("id"));
            autor.setNome(rs.getString("nome"));
            autor.setBiografia(rs.getString("biografia"));
            autor.setData_nasc(rs.getDate("data_nasc"));
            autor.setNacionalidade(rs.getString("nacionalidade"));

            autor_results.add(autor);
        }

        return autor_results;
    }
    
}
