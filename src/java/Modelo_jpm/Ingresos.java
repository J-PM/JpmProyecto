
package Modelo_jpm;
    
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Ingresos extends Conexion{
    
    String cod_proveedores;
    String cod_productos;
    String candidad;
    String valor_uni;
    String subtotal;
    String iva;
    String total;
    Statement state;
    ResultSet rs;
    
    public Ingresos(String id_proveedores, String id_productos, String ing_fecha,String ing_cantidad, String ing_vu, String ing_st, String ing_iva, String ing_vt){ 
        this.candidad=ing_cantidad;
        this.cod_productos=id_productos;
        this.cod_proveedores=id_proveedores;
        this.subtotal=ing_st;
        this.total=ing_vt;
        this.iva=ing_iva;
        this.valor_uni=ing_vu;
    }
    
    
    public boolean insertar() {

        try {
            String query = "INSERT INTO  ( id_proveedores, id_productos, ing_cantidad, ing_vu, ing_st, ing_iva, ing_vt, ing_fecha) VALUES (UPPER ('"+cod_proveedores+"'||' '||'"+cod_productos+"'), REPLACE('"+candidad+"',' ', ''), REPLACE('"+valor_uni+"',' ',''), UPPER ('"+subtotal+"')), REPLACE('"+iva+"',' ', ''),  REPLACE('"+total+"',' ', '')" ;           
                    int saber = 0;
            state = con.createStatement();
            saber = state.executeUpdate(query);
            if (saber == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public String getCod_proveedores() {
        return cod_proveedores;
    }

    public void setCod_proveedores(String cod_proveedores) {
        this.cod_proveedores = cod_proveedores;
    }

    public String getCod_productos() {
        return cod_productos;
    }

    public void setCod_productos(String cod_productos) {
        this.cod_productos = cod_productos;
    }

    public String getCandidad() {
        return candidad;
    }

    public void setCandidad(String candidad) {
        this.candidad = candidad;
    }

    public String getValor_uni() {
        return valor_uni;
    }

    public void setValor_uni(String valor_uni) {
        this.valor_uni = valor_uni;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    

}
