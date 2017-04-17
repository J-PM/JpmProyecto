
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Class.forName("oracle.jdbc.OracleDriver");
    Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");
    Statement st = cn.createStatement();

    ResultSet rs ;
%>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link rel="stylesheet" href="./css/producto.css">
        <link rel="stylesheet" href="./css/Clientes.css">
        <link rel="stylesheet" href="./css/Formularios.css">

        <title>Productos</title>
    </head>
    <body>


        <div class="datagrid">
            <table>
                <thead><tr><th>Codigo</th><th>Nombre</th><th>Unidad</th><th>Telefono</th></tr></thead>
                <tfoot>
                    <tr><td colspan="4"><div id="paging"><ul><li><a href="#"><span>Previous</span></a></li><li><a href="#" class="active"><span>1</span></a></li><li><a href="#"><span>2</span></a></li><li><a href="#"><span>3</span></a></li><li><a href="#"><span>4</span></a></li><li><a href="#"><span>5</span></a></li><li><a href="#"><span>Next</span></a></li></ul></div></tr></tfoot>
                <tbody>

            <%
                
                rs=st.executeQuery("SELECT ID_PRODUCTO, NOM_PRODUCTO, UNIDAD_PRODUCTO, VALOR_PRODUCTO FROM PRODUCTOS");
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getString("ID_PRODUCTO") + "</td><td>" + rs.getString("NOM_PRODUCTO") + "</td><td>" + rs.getString("UNIDAD_PRODUCTO") + "</td><td>" + rs.getString("VALOR_PRODUCTO") + "</td></tr>");

                }
            %>
                </tbody>
            </table>
        </div>


     
        <br>
        <hr><br>

     
        <div id="openModal" class="modalDialog">
            <div>
                <a href="#close" title="Cerrar"  class="close">X</a>


                <form class="form-register" action="producto" method="POST">
                    <h2 class="form-titulo">Registro de Productos</h2>
                    <div class="contenedor-imputs">
                        <input class="input-100" type="text" placeholder="Detalle" required  name="detalle" value="" />
                        <input class="input-48" type="text" placeholder="Unidad" required  name="unidad" value="" />
                        <input class="input-48" type="text" placeholder="Costo" required  name="costo" value="" />           
                        <input class="btn" type="submit" value="REGISTRAR">
                        <input class="btn" type="reset" value="LIMPIAR">
                    </div>
                </form>
            </div>
        </div>
         <p align="center"><a href="#openModal " class="btn1">Ingresar nuevo</a></p>
    </body>
</html>
