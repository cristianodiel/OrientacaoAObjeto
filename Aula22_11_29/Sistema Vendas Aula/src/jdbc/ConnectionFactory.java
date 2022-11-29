/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author CristianoLuizDiel
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private final String ip = "127.0.0.1";
    private final String port = "3306";
    private final String user = "usuario";
    private final String pass = "123";
    private final String bd = "bdvendas";

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + bd, user, pass);

        } catch (SQLException erro) {
            System.err.println(erro);
            throw new RuntimeException(erro);
        }

    }

}