package creational;

import creational.ExporterCreater.CSVBookMetadataExporter;
import creational.ExporterCreater.JSONBookMetadataExporter;
import creational.ExporterCreater.XMLBookMetadataExporter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException {
        FileOutputStream fileOutput = new FileOutputStream("csv_output.csv");
        PrintStream printStream = new PrintStream(fileOutput);
        //Expected usage
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.cleanArchBook);
        exporter.export(printStream);
    }
}
