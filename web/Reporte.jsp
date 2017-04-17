

<%@page import="java.sql.ResultSet"%>
<%@page import="com.itextpdf.text.BaseColor"%>
<%@page import="com.itextpdf.text.FontFactory"%>
<%@page import="com.itextpdf.text.pdf.PdfPCell"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.PageSize"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.pdf.PdfPTable"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.Font"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
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
%>