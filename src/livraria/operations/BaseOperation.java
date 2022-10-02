/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.operations;
import java.sql.*;

/**
 *
 * @author lucas
 */
public abstract class BaseOperation {

    /**
     * This method is necessary to implements for validate params for
     * operations
     * 
     * @param object
     * @return
     */
    public abstract boolean validateParams(Object object);

    /**
     * This method is necessary to implements for process blocks of
     * operations
     * 
     * @param object
     * @return
     */
    public abstract Object process(Object object);
}
