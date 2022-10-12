/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.controllers;

import java.util.ArrayList;
import livraria.operations.autor.*;
import java.sql.Connection;
import livraria.connection.ConnectionDatabase;
import livraria.models.Autor;

/**
 *
 * @author lucas
 */
public class AutorController extends BaseController {
    Connection connection = null;
    
    public AutorController(){
        this.connection = new ConnectionDatabase().getConnection();
    }

    @Override
    public ArrayList<Autor> showAll() {
        ListAll operationGetAll = new ListAll(this.connection);
        ArrayList<Autor> result = (ArrayList<Autor>) operationGetAll.process(null);
        return result;
    }

    @Override
    public Object show(Object object) {
        Show showOperation = new Show(this.connection);
        Autor autor = (Autor) showOperation.process(object);
        return autor;
    }

    @Override
    public boolean create(Object object) {
        Create createOperation = new Create(this.connection);
        boolean result = (boolean) createOperation.process(object);
        return result;
    }

    @Override
    public boolean delete(Object object) {
        Delete deleteOperation = new Delete(this.connection);
        boolean result = (boolean) deleteOperation.process(object);
        return result;
    }

    @Override
    public boolean update(Object object) {
        Update updateOperation = new Update(this.connection);
        boolean result = (boolean) updateOperation.process(object);
        return result;
    }
}
