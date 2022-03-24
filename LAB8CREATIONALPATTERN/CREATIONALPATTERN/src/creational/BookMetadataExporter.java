package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        
    }
     public abstract BookMetadataFormatter createFomatter();
}
