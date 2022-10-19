/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations.livro;
import livraria.operations.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import livraria.models.*;

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
    public boolean validateParams(Object livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object process(Object params) {

        Livro livro = (Livro) params;

        try{
            this.createLivro(livro);
        } catch (SQLException e) {
            System.out.println("Erro ao criar livro: " + e);
            return false;
        }

        return true;
    }
    
    private void createLivro(Livro livro) throws SQLException{
        String query = "insert into livros(nome, codigo, lingua, ano, autor) values (?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.connection.prepareStatement(query);

        stmt.setString(1, livro.getNome());
        stmt.setString(2, livro.getCodigo());
        stmt.setString(3, livro.getLingua());
        stmt.setInt(4, livro.getAno());
        stmt.setString(5, livro.getAutor());

        stmt.executeUpdate();

        System.out.println("Livro cadastrado com sucesso");
    }
}
