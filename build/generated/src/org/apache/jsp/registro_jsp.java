package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Statement state;
    ResultSet rs;
    Connection con;
    try {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");



      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/regis.css\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"contenido\">\n");
      out.write("            <div class=\"form_top\">\n");
      out.write("                <h2>Registro<span>Usuarios</span></h2>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <form class=\"form_reg\" action=\"Registro\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input class=\"input\" type=\"text\" placeholder=\"&#128100; Nombre\" required autofocus name=\"nombre\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"text\" placeholder=\"Apellido\" required  name=\"apellido\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"email\" placeholder=\"&#9993; email\" required  name=\"email\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"tel\" placeholder=\"&#128222; Telefono\" required  name=\"telefono\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"text\" placeholder=\"&#8962; Direccion\" required  name=\"direccion\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"text\" placeholder=\"&#128100; Usuario\" required  name=\"usuario\" value=\"\" />\n");
      out.write("                <input class=\"input\" type=\"password\" placeholder=\"&#128100; Password\" name=\"contrasena\" value=\"\" />\n");
      out.write("                <select name=\"roles\">\n");
      out.write("                    ");
                        state = con.createStatement();
                            rs = state.executeQuery("select * from roles");
                            if (!rs.next()) {
                                out.println("<optin value=\"0\" selected>no hay datos</option>");
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


                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <input class=\"btn__submit\" type=\"submit\" value=\"REGISTRAR\">\n");
      out.write("                <input class=\"btn_reset\" type=\"reset\" value=\"LIMPIAR\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
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
