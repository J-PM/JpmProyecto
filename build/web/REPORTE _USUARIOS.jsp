
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
        String sql="Select *from USUARIOS";
        ResultSet rs =st.executeQuery(sql);
        //genera pdf
        String encabezado="REPORTE USUARIOS";
        java.util.Date date=new java.util.Date();
        
        Font fuente=new Font(Font.getFamily("ARIAL"),12,Font.BOLD);
        Paragraph linea1=new Paragraph(encabezado,fuente);
        Paragraph fecha=new Paragraph(String.valueOf(date));
        
        
        
        PdfPTable tabla=new PdfPTable(10);
        tabla.setWidthPercentage(100);
        Document documento=new Document(PageSize.A4);
        String archivo="C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\JpmProyecto\\web\\Reporte Usuarios.pdf";
        
       PdfWriter.getInstance(documento,new FileOutputStream(archivo));
       
       PdfPCell celda1 = new PdfPCell (new Paragraph("ID_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda2 = new PdfPCell (new Paragraph("ID_ROL",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda3 = new PdfPCell(new Paragraph("NOM_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda4 = new PdfPCell  (new Paragraph("APE_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda5 = new PdfPCell (new Paragraph("DIR_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda6 = new PdfPCell (new Paragraph("TEL_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda7 = new PdfPCell (new Paragraph("CED_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda8 = new PdfPCell (new Paragraph("PAS_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       PdfPCell celda9 = new PdfPCell (new Paragraph("USER_USUARIO",FontFactory.getFont("Arial",10,Font.BOLD,BaseColor.RED)));
       
       documento.open();
       documento.add(linea1);
       documento.add(fecha);
        documento.add(celda1);
        documento.add(celda2);
        documento.add(celda3);
        documento.add(celda4);
        documento.add(celda5);
        documento.add(celda6);
        documento.add(celda7);
         documento.add(celda8);
        documento.add(celda9);          
        
         tabla.addCell(celda1);
          tabla.addCell(celda2);
          tabla.addCell(celda3);
          tabla.addCell(celda4);
          tabla.addCell(celda5);
          tabla.addCell(celda6);
          tabla.addCell(celda7);
          tabla.addCell(celda8);
          tabla.addCell(celda9);
        
          
       while(rs.next()){
          tabla.addCell(rs.getString("ID_USUARIO")); 
          tabla.addCell(rs.getString("ID_ROL")); 
          tabla.addCell(rs.getString("NOM_USUARIO")); 
          tabla.addCell(rs.getString("APE_USUARIO")); 
          tabla.addCell(rs.getString("DIR_USUARIO"));     
          tabla.addCell(rs.getString("TEL_USUARIO")); 
          tabla.addCell(rs.getString("CED_USUARIO")); 
          tabla.addCell(rs.getString("PAS_USUARIO"));
          tabla.addCell(rs.getString("USER_USUARIO"));
            
           
       }
       documento.add(tabla);
       documento.close();
       
       
       out.print("<script>");
       out.print("alert('Segenero con Exito el Pdf');");
       out.print("location.href='C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\JpmProyecto\\web\\Reporte Usuarios.pdf';");
       out.print("</script>");
       
       
       
    }catch(Exception e){
               
          out.print(e);
       }
   %>     
      