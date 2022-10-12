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
            result = this.getLivroById(livro);
        } catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public Livro getLivroById(Livro livro) throws SQLException{
        String query = "select * from livros where nome = ?";
        
        PreparedStatement stmtShowLivro = 
                this.connection.prepareStatement(query);
        
        stmtShowLivro.setString(1, livro.getNome());
        
        ResultSet result = stmtShowLivro.executeQuery();
        
        Livro livro_r = new Livro();
        
        livro_r.setCodigo(result.getString("codigo"));
        livro_r.setLingua(result.getString("lingua"));
        livro_r.setNome(result.getString("nome"));
        livro_r.setAno(result.getInt("ano"));
        
        return livro_r;
    }
}
