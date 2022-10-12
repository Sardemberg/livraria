/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.tests;
import java.util.ArrayList;
import livraria.connection.ConnectionDatabase;
import livraria.models.Livro;
import livraria.controllers.*;

/**
 *
 * @author lucas
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        LivroController controllerLivro = new LivroController();
        Livro livro = new Livro();

        livro.setId(1);
        livro.setNome("Luiza");
        livro.setCodigo("123456");
        livro.setAno(2022);
        livro.setLingua("Inglês");

        boolean result = controllerLivro.update(livro);
        
        System.out.println(result);
    }
}
