package livraria.controllers;

import java.sql.Connection;
import java.util.ArrayList;

public class LivroController extends BaseController {
    Connection connection = null;

    public void LivroController(Connection connection){
        this.connection = connection;
    }

    @Override
    public ArrayList<Object> showAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object show(Object object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean create(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Object object) {
        // TODO Auto-generated method stub
        return false;
    }
}
