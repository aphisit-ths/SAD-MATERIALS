package creational;

import creational.BookCollection;
import creational.BookMetadataFormatter;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

// Factory 
public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        
        //Prepare formatter
        BookMetadataFormatter formatter = createFomatter();

        // get book object form books hashset then append to formatter.
        books.forEach(bookObj -> {
            formatter.append(bookObj);
        });

        // print with selected stream.
        System.out.println("<---------- Sucessfully  -----------> ");
        stream.println(formatter.getMetadataString());

    }

    public abstract BookMetadataFormatter createFomatter() throws IOException, ParserConfigurationException;
}
