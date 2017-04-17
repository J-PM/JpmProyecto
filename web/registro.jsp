
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Statement state;
    ResultSet rs;
    Connection con;
    try {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");


%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link rel="stylesheet" href="./css/regis.css">

        <title>JSP Page</title>
    </head>
    <body>


        <hr>
        <div class="contenido">
            <div class="form_top">
                <h2>Registro<span>Usuarios</span></h2>
            </div>
            <br>

            <form class="form_reg" action="Registro" method="post">


                <input class="input" type="text" placeholder="&#128100; Nombre" required autofocus name="nombre" value="" />
                <input class="input" type="text" placeholder="Apellido" required  name="apellido" value="" />
                <input class="input" type="email" placeholder="&#9993; email" required  name="email" value="" />
                <input class="input" type="tel" placeholder="&#128222; Telefono" required  name="telefono" value="" />
                <input class="input" type="text" placeholder="&#8962; Direccion" required  name="direccion" value="" />
                <input class="input" type="text" placeholder="&#128100; Usuario" required  name="usuario" value="" />
                <input class="input" type="password" placeholder="&#128100; Password" name="contrasena" value="" />
                <select class="input" name="roles" >

                    <%                        state = con.createStatement();
                            rs = state.executeQuery("select * from roles");
                            if (!rs.next()) {
                                out.println("<option value=\"0\" selected>no hay datos</option>");
                            } else {
                                do {
                                    out.println("<option value=\"" + rs.getString(1) + "\">" + rs.getString(2) + "</option>");
                                } while (rs.next());
                            }
                            System.out.println("conexion exitosa");
                        } catch (Exception e3) {
                            out.println("<option value=\"0\" selected>No hay datos</option>");
                            System.out.println("no hizo conexion");
                            e3.printStackTrace(System.err);
                        }


                    %>
                </select>
                <input class="btn__submit" type="submit" value="REGISTRAR">
                <input class="btn_reset" type="reset" value="LIMPIAR">
                

            </form>

        </div>

    </body>
</html>
