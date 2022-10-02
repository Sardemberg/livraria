/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.tests;
import livraria.connection.ConnectionDatabase;
import livraria.models.Livro;
import livraria.operations.livro.Show;

/**
 *
 * @author lucas
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        ConnectionDatabase con = new ConnectionDatabase();
        Show livroShow = new Show(con.getConnection());
        
        Livro livro = new Livro();
//        livro.setId(1);
//        System.out.println(livroShow.process(livroShow));

        Object object = new Object();
        object = livro;
        
        System.out.println(object.getClass().getDeclaredMethod("getId")());
    }
}
