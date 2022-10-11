package livraria.controllers;

import java.util.ArrayList;

public abstract class BaseController {
    
    /*
     * Method to return arraylist of all values for entity
     */
    public abstract ArrayList<Object> showAll();

    /*
     * Method to return especific value for a entity
     */
    public abstract Object show(Object object);

    /*
     * Method to create a value for a entity
     */
    public abstract boolean create(Object object);

    /*
     * Method to delete a value for a entity
     */
    public abstract boolean delete(Object object);

}
