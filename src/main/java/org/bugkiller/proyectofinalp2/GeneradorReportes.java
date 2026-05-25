package org.bugkiller.proyectofinalp2;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import javafx.scene.control.Alert;

import java.io.FileOutputStream;
import java.lang.annotation.Documented;

public class GeneradorReportes {

    public static void generarReporteEventos(){

        try {

            Document documento = new Document();

            PdfWriter.getInstance(documento, new FileOutputStream("ReporteEventos.pdf"));

            documento.open();

            //TITULO
            Font titulo = new Font(Font.HELVETICA, 20, Font.BOLD);

            Paragraph textoTitulo = new Paragraph("REPORTE DE EVENTOS", titulo);

            textoTitulo.setAlignment(Element.ALIGN_CENTER);

            documento.add(textoTitulo);

            documento.add(new Paragraph(" "));

            //METRICAS
            documento.add(new Paragraph("Ventas Totales: $12.000.000"));

            documento.add(new Paragraph("Usuarios registrados: 320"));

            documento.add(new Paragraph("Eventos activos: 12"));

            documento.add(new Paragraph(" "));

            //TABLA
            PdfPTable tabla = new PdfPTable(4);

            tabla.addCell("ID");
            tabla.addCell("Evento");
            tabla.addCell("Fecha");
            tabla.addCell("Lugar");

            tabla.addCell("1");
            tabla.addCell("Concierto Rock");
            tabla.addCell("25/06/2026");
            tabla.addCell("Cali");

            tabla.addCell("2");
            tabla.addCell("Festival Tech");
            tabla.addCell("30/06/2026");
            tabla.addCell("Armenia");

            documento.add(tabla);

            documento.close();

            System.out.println("PDF generado correctamente");

            Alert alerta = new Alert(Alert.AlertType.INFORMATION);

            alerta.setTitle("Reporte");
            alerta.setHeaderText(null);
            alerta.setContentText("PDF generado correctamente");
            alerta.showAndWait();

        }catch (Exception excepcion){

            excepcion.printStackTrace();

        }
    }
}
