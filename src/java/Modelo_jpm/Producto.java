package Modelo_jpm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto extends Conexion {

    String nom_producto;
    String unidad_producto;
    String valor_producto;
    Statement state;
    ResultSet rs;

    public Producto(String nom_producto, String unidad_producto, String valor_producto) {
        this.nom_producto = nom_producto;
        this.unidad_producto = unidad_producto;
        this.valor_producto = valor_producto;

    }

    public boolean insertar() {
        try {
            String query = "INSERT INTO productos (nom_producto, unidad_producto, valor_producto) values ('" + nom_producto + "', '" + unidad_producto + "', '" + valor_producto + "')";
            int saber = 0;

            state = con.createStatement();
            saber = state.executeUpdate(query);

            if (saber == 1) {
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void mostrar() {
        try {
            state = con.createStatement();
            rs = state.executeQuery("select * from estructura.producto");
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getUnidad_producto() {
        return unidad_producto;
    }

    public void setUnidad_producto(String unidad_producto) {
        this.unidad_producto = unidad_producto;
    }

    public String getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(String valor_producto) {
        this.valor_producto = valor_producto;
    }

}
