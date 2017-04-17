/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_jpm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Consultas extends Conexion{
    
    public Boolean Autenticacion(String user, String pass)throws SQLException{
            Boolean opt = false;
            Statement st = con.createStatement();
            String query= "SELECT NOMBRE_USUARIO, CLAVE_USUARIO from usuarios";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                if(rs.getString("NOMBRE_USUARIO").equals(user) && rs.getString("CLAVE_USUARIO").equals(pass)){
                    return true;
                }
            }
       
      return opt;
    }
        
        
       
}
