package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Reporte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "INTEGRADOR", "INTEGRADOR");
        Statement st = cn.createStatement();

        String sql = "SELECT ID_USUARIO, ID_ROL, NOM_USUARIO, APE_USUARIO FROM USUARIOS";
        ResultSet rs = st.executeQuery(sql);
        String encabezado = "Reporte Usuarios";
        java.util.Date date = new java.util.Date();

        Font fuente = new Font(Font.getFamily("ARIAL"), 12, Font.BOLD);
        Paragraph lineal = new Paragraph(encabezado, fuente);
        Paragraph fecha = new Paragraph(String.valueOf(date));

        PdfPTable tabla = new PdfPTable(4);
        tabla.setWidthPercentage(100);

        Document documento = new Document(PageSize.A4);

        String archivo = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\JpmProyecto\\web\\Reporte.pdf";
        PdfWriter pd = PdfWriter.getInstance(documento, new FileOutputStream(archivo));

        PdfPCell celda1 = new PdfPCell(new Paragraph("ID_USUARIO", FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.BLACK)));
        PdfPCell celda2 = new PdfPCell(new Paragraph("ID_ROL", FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.RED)));
        PdfPCell celda3 = new PdfPCell(new Paragraph("NOM_USUARIO", FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.RED)));
        PdfPCell celda4 = new PdfPCell(new Paragraph("APE_USUARIO", FontFactory.getFont("arial", 10, Font.BOLD, BaseColor.RED)));

        documento.open();

        documento.add(lineal);
        documento.add(fecha);

        tabla.addCell(celda1);
        tabla.addCell(celda2);
        tabla.addCell(celda3);
        tabla.addCell(celda4);

        while (rs.next()) {
            tabla.addCell(rs.getString("ID_USUARIO"));
            tabla.addCell(rs.getString("ID_ROL"));
            tabla.addCell(rs.getString("NOM_USUARIO"));
            tabla.addCell(rs.getString("APE_USUARIO"));
        }

        documento.add(tabla);
        documento.close();

        out.print("<script>");
        out.print("alert('se genero con Exito el PDF');");
        out.print("location.href='Reporte.pdf';");
        out.print("</script>");

    } catch (Exception e) {

    }

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
