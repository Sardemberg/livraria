package livraria.controllers;

import java.sql.Connection;
import java.util.ArrayList;
import livraria.models.Edicao;
import livraria.operations.edicao.*;
import livraria.connection.ConnectionDatabase;

public class EdicaoController extends BaseController {
    Connection connection = null;
    
    public EdicaoController(Connection connection){
        this.connection = new ConnectionDatabase().getConnection();
    }

    @Override
    public ArrayList<Edicao> showAll() {
        ListAll operationListAll = new ListAll(this.connection);
        ArrayList<Edicao> edicoes = (ArrayList<Edicao>) operationListAll.process(null);
        return edicoes;
    }

    @Override
    public Object show(Object object) {
        Show operationShow = new Show(this.connection);
        Edicao edicao = (Edicao) operationShow.process(object);
        return edicao;
    }

    @Override
    public boolean create(Object object) {
        Create operationCreate = new Create(this.connection);
        boolean result = (boolean) operationCreate.process(operationCreate);
        return result;
    }

    @Override
    public boolean delete(Object object) {
        Delete operationDelete = new Delete(this.connection);
        boolean result = (boolean) operationDelete.process(object);
        return result;
    }

    @Override
    public boolean update(Object object) {
        Update operationUpdate = new Update(this.connection);
        boolean result = (boolean) operationUpdate.process(object);
        return result;
    }
    
    
    
}