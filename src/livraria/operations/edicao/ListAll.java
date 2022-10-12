package livraria.operations.edicao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import livraria.operations.BaseOperation;
import livraria.models.Edicao;


public class ListAll extends BaseOperation {
    private Connection connection = null;

    public ListAll(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object process(Object object) {
        ArrayList<Edicao> results = null;

        try {
            results = this.ListAllEdicoes();
        } catch (SQLException e){
            System.out.println("Erro ao buscar edição: " + e);
        }

        return results;
    }

    private ArrayList<Edicao> ListAllEdicoes() throws SQLException{
        String query = "select * from edicoes";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Edicao> edicoes_results = null;

        while(rs.next()){
            Edicao edicao = new Edicao();

            edicao.setId(rs.getInt("id"));
            edicao.setIsbn(rs.getString("isbn"));
            edicao.setPreco(rs.getFloat("preco"));
            edicao.setAno(rs.getDate("ano"));
            edicao.setN_paginas(rs.getInt("número de páginas"));
            edicao.setQuant_estoque(rs.getInt("quantidade em estoque"));

            edicoes_results.add(edicao);
        }

        return edicoes_results;
    }
}
