

<%@page import="Modelo_jpm.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link rel="stylesheet" href="./css/main2.css">
        <title>Login</title>
    </head>
    <body>
        <div class="login_container">
            <div class="login_top">

                <h2 class="login_title">Contro<span>Lex</span></h2>
            </div>
            <h1>BIENVENIDO</h1>
            <form action="ValUser" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>usuario: </td>
                            <td><input type="text" name="usuario" value="" /></td>
                        </tr>
                        <tr>
                            <td>contarseña</td>
                            <td><input type="password" name="contrasena" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="INGRESAR" /></td>
                        </tr>
                    </tbody>
                </table>

            </form>
            <form action="registro.jsp" method="post">
                <input type="submit" value="REGISTRO" />

            </form>
        </div>   


    </body>
</html>
