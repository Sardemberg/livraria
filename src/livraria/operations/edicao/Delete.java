package livraria.operations.edicao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import livraria.models.*;

import livraria.operations.BaseOperation;

public class Delete extends BaseOperation {
    public Connection connection = null;

    public Delete(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean validateParams(Object object) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public Object process(Object params) {
        
        Edicao edicao = (Edicao) params;

        try{
            this.deleteEdicao(edicao.getId());
        }catch(SQLException e){
            System.out.println("Erro ao deletar edição" + e);
            return false;
        }

        return true;
    }

    private void deleteEdicao(int id) throws SQLException{
        String query = "delete from edicoes where id = ?";

        PreparedStatement stmt = this.connection.prepareStatement(query);
        stmt.setInt(0, id);

        stmt.executeQuery();
        System.out.println("Edição deletada com sucesso!");
    }
}
