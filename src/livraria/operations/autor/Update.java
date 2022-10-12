/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations.autor;

import livraria.operations.BaseOperation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.models.Autor;

/**
 *
 * @author lucas
 */
public class Update extends BaseOperation {
    private Connection connection;
    
    public Update(Connection connection){
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
            this.updateAutor(autor);
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return false;
    }
    
    private void updateAutor(Autor autor) throws SQLException{
        String query = "update livros set nome = ?, biografia = ?, nacionalidade = ?, data_nasc = ? where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);

        stmt.setString(1, autor.getNome());
        stmt.setString(2, autor.getBiografia());
        stmt.setString(3, autor.getNacionalidade());
        stmt.setDate(4, autor.getData_nasc());
        stmt.setInt(5, autor.getId());

        stmt.executeUpdate();
        System.out.println("Autor atualizado com sucesso!");
    }
    
}
