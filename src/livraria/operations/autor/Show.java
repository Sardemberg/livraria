package livraria.operations.autor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import livraria.models.Autor;
import livraria.operations.BaseOperation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Show extends BaseOperation {
    Connection connection = null;
    
    public Show(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object process(Object object) {
        Autor autor = (Autor) object;
        Autor autor_result = new Autor();
        
        try{
            autor_result = this.getAutorByName(autor);
        }catch(SQLException e){
            System.out.println("Error: " + e);
        }
        
        return autor_result;
    }
    
    public Autor getAutorByName(Autor autor) throws SQLException{
        String query = "select * from autores where nome = ?";
        
        PreparedStatement stmtShowLivro = 
                this.connection.prepareStatement(query);
        
        stmtShowLivro.setString(1, autor.getNome());
        
        ResultSet result = stmtShowLivro.executeQuery();
        
        Autor autor_r = new Autor();
        
        autor_r.setBiografia(result.getString("biografia"));
        autor_r.setData_nasc(result.getDate("data_nasc"));
        autor_r.setNacionalidade(result.getString("nacionalidade"));
        autor_r.setNome(result.getString("nome"));
        
        return autor_r;
    }
    
}
