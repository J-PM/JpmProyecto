package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    Class.forName("oracle.jdbc.OracleDriver");
    Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");
    Statement st = cn.createStatement();

    String sql = "SELECT ID_PRODUCTO, NOM_PRODUCTO, UNIDAD_PRODUCTO, VALOR_PRODUCTO FROM PRODUCTOS";
    ResultSet rs = st.executeQuery(sql);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/producto.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/Clientes.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/Formularios.css\">\n");
      out.write("\n");
      out.write("        <title>Registro de productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--h1>REGISTRO <br>DE PRODUCTOS</h1>\n");
      out.write("        <a name=\"productos\"></a>\n");
      out.write("        <form action=\"producto\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <input class=\"input\" type=\"text\" placeholder=\"Detalle\" required  name=\"detalle\" value=\"\" />\n");
      out.write("            <input class=\"input\" type=\"text\" placeholder=\"Unidad\" required  name=\"unidad\" value=\"\" />\n");
      out.write("            <input class=\"input\" type=\"text\" placeholder=\"Costo\" required  name=\"costo\" value=\"\" /> <br>          \n");
      out.write("            <input class=\"btn__submit\" type=\"submit\" value=\"REGISTRAR\">\n");
      out.write("            <input class=\"btn_reset\" type=\"reset\" value=\"LIMPIAR\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        <br-->\n");
      out.write("\n");
      out.write("        <table border=\"1\">               \n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo</td>\n");
      out.write("                <td>Detalle</td>\n");
      out.write("                <td>Unidad</td> \n");
      out.write("                <td>Valor</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                while (rs.next()) {
                    out.println("<tr><td>" + rs.getString("ID_PRODUCTO") + "</td><td>" + rs.getString("NOM_PRODUCTO") + "</td><td>" + rs.getString("UNIDAD_PRODUCTO") + "</td><td>" + rs.getString("VALOR_PRODUCTO") + "</td></tr>");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <hr><br>\n");
      out.write("\n");
      out.write("        <a href=\"#openModal \">Ingresar nuevo</a>\n");
      out.write("        <div id=\"openModal\" class=\"modalDialog\">\n");
      out.write("            <div>\n");
      out.write("                <a href=\"#close\" title=\"Cerrar\"  class=\"close\">X</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form class=\"form-register\" action=\"producto\" method=\"POST\">\n");
      out.write("                    <h2 class=\"form-titulo\">Registro de clientes</h2>\n");
      out.write("                    <div class=\"contenedor-imputs\">\n");
      out.write("                        <input class=\"input-100\" type=\"text\" placeholder=\"Detalle\" required  name=\"detalle\" value=\"\" />\n");
      out.write("                        <input class=\"input-48\" type=\"text\" placeholder=\"Unidad\" required  name=\"unidad\" value=\"\" />\n");
      out.write("                        <input class=\"input-48\" type=\"text\" placeholder=\"Costo\" required  name=\"costo\" value=\"\" /> <br>          \n");
      out.write("                        <input class=\"btn\" type=\"submit\" value=\"REGISTRAR\">\n");
      out.write("                        <input class=\"btn\" type=\"reset\" value=\"LIMPIAR\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
