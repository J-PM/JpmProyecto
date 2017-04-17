
package Modelo_jpm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proveedores extends Conexion{
    
    String NOMBRE_PROVEEDORES;
    String RUC_PROVEEDORES;
    String TELEFONO_PROVEEDORES;
    
    Statement state;
    ResultSet rs;
    
    public Proveedores (String NOMBRE_PROVEEDORES, String RUC_PROVEEDORES, String TELEFONO_PROVEEDORES){
        this.NOMBRE_PROVEEDORES=NOMBRE_PROVEEDORES;
        this.RUC_PROVEEDORES=RUC_PROVEEDORES;
        this.TELEFONO_PROVEEDORES=TELEFONO_PROVEEDORES;
    }
    
    public boolean inserta(){
        
        try {
            String query="insert into proveedores (NOMBRE_PROVEEDORES, RUC_PROVEEDORES, TELEFONO_PROVEEDORES) values ('"+NOMBRE_PROVEEDORES+"','"+RUC_PROVEEDORES+"', '"+TELEFONO_PROVEEDORES+"')";
            int saber=0;
            
            state=con.createStatement();
            saber=state.executeUpdate(query);
            
            if(saber==1){
                return true;
               
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
    }
    
    
    
    

    public String getNOMBRE_PROVEEDORES() {
        return NOMBRE_PROVEEDORES;
    }

    public void setNOMBRE_PROVEEDORES(String NOMBRE_PROVEEDORES) {
        this.NOMBRE_PROVEEDORES = NOMBRE_PROVEEDORES;
    }

    public String getRUC_PROVEEDORES() {
        return RUC_PROVEEDORES;
    }

    public void setRUC_PROVEEDORES(String RUC_PROVEEDORES) {
        this.RUC_PROVEEDORES = RUC_PROVEEDORES;
    }

    public String getTELEFONO_PROVEEDORES() {
        return TELEFONO_PROVEEDORES;
    }

    public void setTELEFONO_PROVEEDORES(String TELEFONO_PROVEEDORES) {
        this.TELEFONO_PROVEEDORES = TELEFONO_PROVEEDORES;
    }
    
    
    
    
    
}
