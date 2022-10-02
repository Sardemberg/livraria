package livraria.operations.livro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import livraria.models.Livro;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import livraria.operations.BaseOperation;

/**
 *
 * @author lucas
 */
public class Show extends BaseOperation {
    private Connection connection = null;
    
    public Show(Connection connection){
        this.connection = connection;
    }
    
    @Override
    public boolean validateParams(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object process(Object params) {
        Livro result = null;
        
        Livro livro = Livro.class.cast(params);
        
        try {
            result = this.getLivroById(livro.getId());
        } catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public Livro getLivroById(int id) throws SQLException{
        String query = "select * from livros where id = ?";
        
        PreparedStatement stmtShowLivro = 
                this.connection.prepareStatement(query);
        
        stmtShowLivro.setInt(1, id);
        
        ResultSet result = stmtShowLivro.executeQuery();
        
        Livro livro = new Livro();
        
        livro.setCodigo(result.getString("codigo"));
        livro.setLingua(result.getString("lingua"));
        livro.setNome(result.getString("nome"));
        
        return livro;
    }
}
