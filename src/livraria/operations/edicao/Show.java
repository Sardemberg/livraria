package livraria.operations.edicao;

import livraria.models.Edicao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import livraria.operations.BaseOperation;

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
        Edicao result = null;
        
        Edicao edicao = Edicao.class.cast(params);
        
        try {
            result = this.getEdicaoById(edicao.getId());
        } catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public Edicao getEdicaoById(int id) throws SQLException{
        String query = "select * from edicoes where id = ?";
        
        PreparedStatement stmtShowEdicao = 
                this.connection.prepareStatement(query);
        
        stmtShowEdicao.setInt(1, id);
        
        ResultSet result = stmtShowEdicao.executeQuery();
        
        Edicao edicao = new Edicao();
        
        edicao.setIsbn(result.getString("codigo"));
        edicao.setPreco(result.getFloat("preco"));
        edicao.setN_paginas(result.getInt("n_paginas"));
        edicao.setQuant_estoque(result.getInt("quant_estoque"));
        
        return edicao;
    }
}
