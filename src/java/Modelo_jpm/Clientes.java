package Modelo_jpm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientes extends Conexion {

    String nombre;
    String apellido;
    String ruc;
    String telf;
    String dir;
    Statement state;
    ResultSet rs;

    public Clientes(String CLI_NOMBRE, String CLI_RUC, String CLI_TELF, String CLI_DIR) {
        this.dir = CLI_DIR;
        this.nombre = CLI_NOMBRE;
        this.ruc = CLI_RUC;
        this.telf = CLI_TELF;

    }

    public boolean insertar() {

        try {
            String query = "INSERT INTO clientes (cli_nombre,cli_ruc,cli_telf, cli_dir) VALUES (UPPER ('"+nombre+"'||' '||'"+apellido+"'), REPLACE('"+ruc+"',' ', ''), REPLACE('"+telf+"',' ',''), UPPER ('"+dir+"'))";            ;
                    int saber = 0;
            state = con.createStatement();
            saber = state.executeUpdate(query);
            if (saber == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void mostrar() {
        try {
            state = con.createStatement();
            rs = state.executeQuery("select * from clientes ");
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
