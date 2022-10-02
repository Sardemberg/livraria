/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria.connection;
import java.sql.*;
/**
 *
 * @author lucas
 */
public class ConnectionDatabase { 
    public Connection getConnection(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/livraria",
                    "root",
                    ""
            );
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao conectar no banco, backtrace: " + e);
        }
        
        return connection;
    }
    
    public void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão, backtrace: " + e);
        }
    }
}
