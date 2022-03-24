/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ExporterCreater;

import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import creational.XMLBookMetadataFormatter;
import creational.XMLBookMetadataFormatter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createFomatter() throws IOException ,ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }

   

}
