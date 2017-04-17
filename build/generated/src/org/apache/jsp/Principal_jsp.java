package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:400,900\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/menu.css\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr>\n");
      out.write("        <h1><p> MENU PRINCIPAL</p></h1> \n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("                              \n");
      out.write("            <ul>\n");
      out.write("                <li> <a href=Productos.jsp class=\"nounderline\">Poductos</a><br></li>\n");
      out.write("                <li> <a href=proveedores.jsp class=\"nounderline\">Proveedores</a><br></li>\n");
      out.write("                <li><a href=clientes.jsp class=\"nounderline\">Clientes</a></li>\n");
      out.write("                <li><a href=Ingresos.jsp class=\"nounderline\">Ingresos</a></li>\n");
      out.write("                <li><a href=Egresos.jsp class=\"nounderline\">Egresos</a></li>\n");
      out.write("                <li><a href=Reporte.jsp class=\"nounderline\">Reportes</a></li>\n");
      out.write("        \n");
      out.write("            </ul>\n");
      out.write("                       \n");
      out.write("            <form action=\"Proveedores\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        </div>  <br><br><hr><br>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("            <p align=\"center\"><a  href=\"ayuda.jsp\">¿Necesitas ayuda?</a></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
