package creational;

import creational.ExporterCreater.CSVBookMetadataExporter;
import creational.ExporterCreater.JSONBookMetadataExporter;
import java.io.FileWriter;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException {

        //Expected usage
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);
    }
}
