/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_jpm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
   public static final String USERNAME = "INTEGRADOR";
    public static final String PASSWORD = "INTEGRADOR";
    public static final String HOST = "localhost";
    public static final String PORT = "1521";
    public static final String DATABASE = "XE";
    public static final String CLASSNAME = "oracle.jdbc.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public Connection con;
    public Conexion(){
        try {
            Class.forName(CLASSNAME);
            try {
                con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
