package livraria.operations.edicao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.operations.BaseOperation;
import livraria.models.Edicao;

public class Update extends BaseOperation {
    private Connection connection = null;

    public Update(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object process(Object object) {
        try {
            Edicao edicao = (Edicao) object;
            this.updateEdicao(edicao);
        } catch (SQLException e) {
            System.out.println("Erro na atualização da edição: " + e);
            return false;
        }

        return true;
    }

    private void updateEdicao(Edicao edicao) throws SQLException{
        String query = "update edicoes set isbn = ?, preco = ?, ano = ?, n_paginas = ?, quant_estoque = ? where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);

        stmt.setString(0, edicao.getIsbn());
        stmt.setFloat(1, edicao.getPreco());
        stmt.setDate(2, (Date) edicao.getAno());
        stmt.setInt(3, edicao.getN_paginas());
        stmt.setInt(4, edicao.getQuant_estoque());
        stmt.setInt(5, edicao.getId());

        stmt.executeQuery();
    }
    
}
