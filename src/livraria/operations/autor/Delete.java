/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations.autor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.operations.BaseOperation;
import java.sql.Connection;
import livraria.models.Autor;

/**
 *
 * @author lucas
 */
public class Delete extends BaseOperation {

    private Connection connection;

    public Delete(Connection connection) {
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
            this.deleteAutor(autor.getId());
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return false;
    }

    private void deleteAutor(int id) throws SQLException {
        String query = "delete from autores where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        stmt.setInt(1, id);

        stmt.executeUpdate();
        System.out.println("Autor deletado com sucesso!");
    }
}
