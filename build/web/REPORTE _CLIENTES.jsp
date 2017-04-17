
<%@page import="com.itextpdf.text.BaseColor"%>
<%@page import="com.itextpdf.text.pdf.PdfPCell"%>
<%@page import="com.itextpdf.text.FontFactory"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="com.itextpdf.text.PageSize"%>
<%@page import="com.itextpdf.text.pdf.PdfPTable"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.Font"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    try{
        Class.forName("oracle.jdbc.OracleDriver");
        Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","INTEGRADOR","INTEGRADOR");
        Statement st=cn.createStatement();
        String sql="Select *from CLIENTES";
        ResultSet rs =st.executeQuery(sql);
        //genera pdf
        String encabezado="REPORTE CLIENTES";
        java.util.Date date=new java.util.Date();
        
        Font fuente=new Font(Font.getFamily("ARIAL"),12,Font.BOLD);
        Paragraph linea1=new Paragraph(encabezado,fuente);
        Paragraph fecha=new Paragraph(String.valueOf(date));
        
        
        
        PdfPTable tabla=new PdfPTable(8);
        tabla.setWidthPercentage(100);
        Document documento=new Document(PageSize.A4);
        String archivo="C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\JpmProyecto\\web\\Reporte Clientes.pdf";
        
       PdfWriter.getInstance(documento,new FileOutputStream(archivo));
       
       PdfPCell celda1 = new PdfPCell (new Paragraph("CLI_ID",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda2 = new PdfPCell (new Paragraph("CLI_NOMRE",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda3 = new PdfPCell(new Paragraph("CLI_RUC",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda4 = new PdfPCell  (new Paragraph("CLI_TELF",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda5 = new PdfPCell (new Paragraph("CLI_DIR",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       
       
       
       documento.open();
       documento.add(linea1);
       documento.add(fecha);
        documento.add(celda1);
        documento.add(celda2);
        documento.add(celda3);
        documento.add(celda4);
        documento.add(celda5);
              
        
         tabla.addCell(celda1);
          tabla.addCell(celda2);
          tabla.addCell(celda3);
          tabla.addCell(celda4);
          tabla.addCell(celda5);
          
       while(rs.next()){
          tabla.addCell(rs.getString("CLI_ID")); 
          tabla.addCell(rs.getString("CLI_NOMBRE")); 
          tabla.addCell(rs.getString("CLI_RUC")); 
          tabla.addCell(rs.getString("CLI_TELF")); 
          tabla.addCell(rs.getString("CLI_DIR")); 
           
       }
       documento.add(tabla);
       documento.close();
       
       
       out.print("<script>");
       out.print("alert('Segenero con Exito el Pdf');");
       out.print("location.href='C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\JpmProyecto\\web\\Reporte Clientes.pdf';");
       out.print("</script>");
       
       
       
    }catch(Exception e){
               
          out.print(e);
       }
   %>     
      