
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="./css/menu.css">
        <title>Menu</title>
    </head>
    <body>
        <hr>
        <h1><p> MENU PRINCIPAL</p></h1> 
        <hr>
        <br>
        <div id="menu">

            <ul>
                <li> <a href=Productos.jsp class="nounderline">Poductos</a><br></li>
                <li> <a href=proveedores.jsp class="nounderline">Proveedores</a><br></li>
                <li><a href=clientes.jsp class="nounderline">Clientes</a></li>
                <li><a href=Ingresos.jsp class="nounderline">Ingresos</a></li>
                <li><a href=Egresos.jsp class="nounderline">Egresos</a></li>
                <li><a href=Reporte.jsp class="nounderline">CLIENTES</a></li>
            </ul>

            <form action="Proveedores" method="POST">


            </form>

        </div>  <br><br><hr><br>
        <br>
        <div>
            <p align="center"><a  href="ayuda.jsp">¿Necesitas ayuda?</a></p>

        </div>
    </body>
</html>
