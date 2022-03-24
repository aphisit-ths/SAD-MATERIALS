package creational;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.csv.CSVPrinter;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private StringWriter strWriter;
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        strWriter = new StringWriter();
        jsonArray = new JSONArray();
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject obj = new JSONObject();

        try {
            obj.put("ISBN", b.getISBN());
            obj.put("Author", Arrays.toString(b.getAuthors()));
            obj.put("Title", b.getTitle());
            obj.put("Title", b.getPublisher());

            //Append to list 
            jsonArray.add(obj);
            strWriter.write(jsonArray.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return jsonArray.toString();
    }
}
