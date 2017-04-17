
package Modelo_jpm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class empresa extends Conexion{
    String NOM_EMPRESA;
    String RUC_EMPRESA;
    String TELF_EMPRESA;
    
    Statement state;
    ResultSet rs;
    
    public empresa(String NOM_EMPRESA, String RUC_EMPRESA, String TELF_EMPRESA){
        this.NOM_EMPRESA=NOM_EMPRESA;
        this.RUC_EMPRESA=RUC_EMPRESA;
        this.TELF_EMPRESA=TELF_EMPRESA;
        
    }
    
    public boolean insert(){
         try {
            String query="insert into EMPRESAS (NOM_EMPRESA, RUC_EMPRESA, TELF_EMPRESA) values ('"+NOM_EMPRESA+"','"+RUC_EMPRESA+"', '"+TELF_EMPRESA+"')";
            int saber=0;
            
            state=con.createStatement();
            saber=state.executeUpdate(query);
            
            if(saber==1){
                return true;
               
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getNOM_EMPRESA() {
        return NOM_EMPRESA;
    }

    public void setNOM_EMPRESA(String NOM_EMPRESA) {
        this.NOM_EMPRESA = NOM_EMPRESA;
    }

    public String getRUC_EMPRESA() {
        return RUC_EMPRESA;
    }

    public void setRUC_EMPRESA(String RUC_EMPRESA) {
        this.RUC_EMPRESA = RUC_EMPRESA;
    }

    public String getTELF_EMPRESA() {
        return TELF_EMPRESA;
    }

    public void setTELF_EMPRESA(String TELF_EMPRESA) {
        this.TELF_EMPRESA = TELF_EMPRESA;
    }
    
        
        
}
