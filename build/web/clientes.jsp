<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link rel="stylesheet" href="./css/producto.css">       
        <link rel="stylesheet" href="./css/Clientes.css">
        <link rel="stylesheet" href="./css/Formularios.css">

        <title>Clientes</title>
    </head>
    <body>
 <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");
            Statement st = cn.createStatement();

            String sql = "SELECT ID_PROVEEDORES, NOMBRE_PROVEEDORES, RUC_PROVEEDORES, TELEFONO_PROVEEDORES FROM PROVEEDORES";
            ResultSet rs = st.executeQuery(sql);
        %>


    <div class="datagrid">
        <table>
            <thead><tr><th>Codigo</th><th>Nombre</th><th>Ruc</th><th>Telefono</th></tr></thead>
            <tfoot>
                <tr><td colspan="4"><div id="paging"><ul><li><a href="#"><span>Previous</span></a></li><li><a href="#" class="active"><span>1</span></a></li><li><a href="#"><span>2</span></a></li><li><a href="#"><span>3</span></a></li><li><a href="#"><span>4</span></a></li><li><a href="#"><span>5</span></a></li><li><a href="#"><span>Next</span></a></li></ul></div></tr></tfoot>
            <tbody>
               
            <%
                while (rs.next()) {
                    out.println("<tr class='alt'><td >" + rs.getString("ID_PROVEEDORES") + "</td><td>" + rs.getString("NOMBRE_PROVEEDORES") + "</td><td>" + rs.getString("RUC_PROVEEDORES") + "</td><td>" + rs.getString("TELEFONO_PROVEEDORES") + "</td></tr>");
                }
            %>  
            </tbody>
        </table>
    </div>




                <div id="openModal" class="modalDialog">
            <div>
                <a href="#close" title="Cerrar"  class="close">X</a>
                
                
                <form class="form-register" action="Clientes" method="POST">
                    <h2 class="form-titulo">Registro de clientes</h2>
                    <div class="contenedor-imputs">
                    <input class="input-48" type="text" placeholder="Nombres" required  name="nom" value="" />
                    <input class="input-48" type="text" placeholder="Apellidos" required  name="ape" value="" />
                    <input class="input-48" type="text" placeholder="ruc" required  name="ruc" value="" />
                    <input class="input-48" type="text" placeholder="telefono" required  name="telf" value="" />
                    <input class="input-100" type="text" placeholder="direccion" required  name="dir" value="" /> <br>          
                    <input class="btn" type="submit" value="REGISTRAR">
                    <input class="btn" type="reset" value="LIMPIAR">
                    </div>
                </form>
            </div>
        </div>

  <p align="center"><a href="#openModal " class="btn1">Ingresar nuevo</a></p>

    </body>
</html>
