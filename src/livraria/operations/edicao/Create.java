package livraria.operations.edicao;

import livraria.operations.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import livraria.models.*;

public class Create extends BaseOperation{
    
    private Connection connection = null;
    
    public Create(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object edicao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object process(Object params) {
        
        Edicao edicao = (Edicao) params;
        
        try{
            this.createEdicao(edicao);
        } catch (SQLException e) {
            System.out.println("Erro ao criar edição:" + e);
            return false;
        }
        
        return true;
    }
    
    private void createEdicao(Edicao edicao) throws SQLException{
        String query = "insert into edicoes(isbn, preco, ano, n_paginas, quant_estoque) values (?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = this.connection.prepareStatement(query);
        
        stmt.setString(0, edicao.getIsbn());
        stmt.setFloat(1, edicao.getPreco());
        stmt.setDate(2, (Date) edicao.getAno());
        stmt.setInt(3, edicao.getN_paginas());
        stmt.setInt(4, edicao.getQuant_estoque());
        
        stmt.executeQuery();
        
        System.out.println("Edição cadastrada com sucesso");
    }
    
}
