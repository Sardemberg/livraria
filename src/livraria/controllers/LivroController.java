package livraria.controllers;

import java.sql.Connection;
import java.util.ArrayList;
import livraria.models.Livro;
import livraria.operations.livro.*;
import livraria.connection.ConnectionDatabase;

public class LivroController extends BaseController {
    Connection connection = null;

    public LivroController(Connection connection){
        this.connection = new ConnectionDatabase().getConnection();
    }

    @Override
    public ArrayList<Livro> showAll() {
        ListAll operationListAll = new ListAll(this.connection);
        ArrayList<Livro> livros = (ArrayList<Livro>) operationListAll.process(null);
        return livros;
    }

    @Override
    public Object show(Object object) {
        Show operationShow = new Show(this.connection);
        Livro livro = (Livro) operationShow.process(object);
        return livro;
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
