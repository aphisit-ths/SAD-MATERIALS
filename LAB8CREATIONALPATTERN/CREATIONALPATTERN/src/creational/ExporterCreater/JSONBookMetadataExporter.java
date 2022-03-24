/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ExporterCreater;

import creational.BookMetadataFormatter;
import creational.BookMetadataExporter;
import creational.JSONBookMetadataFormatter;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author ACER-OAT
 */
public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createFomatter() throws IOException, ParserConfigurationException {
        return new JSONBookMetadataFormatter();
    }

}
