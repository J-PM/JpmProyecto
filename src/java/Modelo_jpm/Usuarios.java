
package Modelo_jpm;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Usuarios extends Conexion{

    String user_usuario;
    String pas_usuario;
    String nom_usuario;
    String ape_usuario;
    String dir_usuario;
    String tel_usuario;
    String ced_usuario;
   
    Statement state;
    ResultSet rs;
    
   
    public Usuarios(String nom_usuario, String ape_usuario, String dir_usuario, String tel_usuario, String ced_usuario, String user_usuario, String pas_usuario){
        this.nom_usuario=nom_usuario;
        this.ape_usuario=ape_usuario;
        this.dir_usuario=dir_usuario;
        this.tel_usuario=tel_usuario;
        this.ced_usuario=ced_usuario;
        this.user_usuario=user_usuario;
        this.pas_usuario=pas_usuario;
        
    }
   
 public boolean insertar() {
        try {
            String query="INSERT INTO integrador.USUARIOS (nom_usuario,  ape_usuario, dir_usuario, tel_usuario, ced_usuario, pas_usuario, user_usuario) \n" +
"values ('"+nom_usuario +"', '"+ape_usuario +"', '"+dir_usuario+"', '"+tel_usuario+"', '"+ced_usuario+"', '"+pas_usuario+"', '"+user_usuario+"')";
            int saber=0;
            
            state=con.createStatement();
            saber=state.executeUpdate(query);
            
            if(saber==1){
                return true;
               
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

       public boolean Login(String user_usuario, String pas_usuario) {
        try {
           
            
            state=con.createStatement();
            rs = state.executeQuery("select * from usuarios");
            while (rs.next()) {
                
                
                this.user_usuario = rs.getString("user_usuario");
                this.pas_usuario = rs.getString("pas_usuario");
                if (user_usuario.equals(this.user_usuario)&& pas_usuario.equals(this.pas_usuario)) {
                    return true;
                } 

            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        return false;
        
    }

    public String getUser_usuario() {
        return user_usuario;
    }

    public void setUser_usuario(String user_usuario) {
        this.user_usuario = user_usuario;
    }

    public String getPas_usuario() {
        return pas_usuario;
    }

    public void setPas_usuario(String pas_usuario) {
        this.pas_usuario = pas_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getApe_usuario() {
        return ape_usuario;
    }

    public void setApe_usuario(String ape_usuario) {
        this.ape_usuario = ape_usuario;
    }

    public String getDir_usuario() {
        return dir_usuario;
    }

    public void setDir_usuario(String dir_usuario) {
        this.dir_usuario = dir_usuario;
    }

    public String getTel_usuario() {
        return tel_usuario;
    }

    public void setTel_usuario(String tel_usuario) {
        this.tel_usuario = tel_usuario;
    }

    public String getCed_usuario() {
        return ced_usuario;
    }

    public void setCed_usuario(String ced_usuario) {
        this.ced_usuario = ced_usuario;
    }


       
}



    
    

    
  

    
    

