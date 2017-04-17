
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/producto.css">
        <link rel="stylesheet" href="./css/Clientes.css">
        <link rel="stylesheet" href="./css/Formularios.css">
        <title>Ingresos</title>

    </head>

    <body>
        <%
            Statement st;
            ResultSet rs;
            Connection con;
            try {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");


        %>



        <div id="openModal" class="modalDialog">
            <div>
                <a href="#close" title="Cerrar"  class="close">X</a>

                <form class="form-register" action="Ingresos" method="POST">
                    <h2 class="form-titulo">Ingreso de Productos</h2>
                    <div class="contenedor-imputs">
                        <input class="input-48" type="text" placeholder="Nombres" required  name="nom" value="" />
                        <select name="Proveesores" class="imput-100">
                            <%                                st = con.createStatement();
                                rs = st.executeQuery("select * from proveedores");
                                if (!rs.next()) {
                                    out.println("<option value=\"0\" selected>Proveedores</option>");
                                } else {
                                    do {
                                        out.println("<option value=\"" + rs.getString(1) + "\">" + rs.getString(2) + "</option>");
                                    } while (rs.next());
                                }
                                System.out.println("conexion exitosa");

                            %>
                        </select>

                        <select name="Productos" class="imput-100">
                                                        <%                                st = con.createStatement();
                                rs = st.executeQuery("select * from proveedores");
                                if (!rs.next()) {
                                    out.println("<option value=\"0\" selected>Proveedores</option>");
                                } else {
                                    do {
                                        out.println("<option value=\"" + rs.getString(1) + "\">" + rs.getString(2) + "</option>");
                                    } while (rs.next());
                                }
                                System.out.println("conexion exitosa");

                            %>


                        </select>


                        <input class="input-48" type="text" placeholder="Cantidad" required  name="" value="" />

                        <input class="input-48" type="text" placeholder="V/U" required  name="" value="unitario" />
                        <input class="input-48" type="text" placeholder="V/Total" required  name="total" value="" />
                        <input class="input-100" type="text" placeholder="Iva" required  name="iva" value="" /> <br>          
                        <input class="btn" type="submit" value="REGISTRAR">
                        <input class="btn" type="reset" value="LIMPIAR">
                    </div>
                </form>
            </div>
        </div>
        <p align="center"><a href="#openModal " class="btn1">Ingresar nuevo</a></p>

        <div class="datagrid">
            <table>
                <thead><tr><th>N Ingreso</th><th>Proveedor</th><th></th><th>fecha</th></tr></thead>
                <tfoot>
                    <tr><td colspan="4"><div id="paging"><ul><li><a href="#"><span>Previous</span></a></li><li><a href="#" class="active"><span>1</span></a></li><li><a href="#"><span>2</span></a></li><li><a href="#"><span>3</span></a></li><li><a href="#"><span>4</span></a></li><li><a href="#"><span>5</span></a></li><li><a href="#"><span>Next</span></a></li></ul></div></tr></tfoot>
                <tbody>

                    <%               
                        rs = st.executeQuery("SELECT ing_id, id_proveedor FROM ingresos");
                        while (rs.next()) {
                            out.println("<tr class='alt'><td >" + rs.getString("ing_id") + "</td><td>" + rs.getString("id_proveedores") + "</td></tr>");
                        }} catch (Exception e3) {
                                    out.println("<option value=\"0\" selected>No hay datos</option>");
                                    System.out.println("no hizo conexion");
                                    e3.printStackTrace(System.err);
                                }

                    %>  
                </tbody>
            </table>
        </div>

    </body>
</html>
