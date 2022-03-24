/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 *
 * @author ACER-OAT
 */
public class PlayGround {


    public static void main(String[] args) {
        FileOutputStream fileOutputStream  = null;
        PrintStream printStream = null;
        
        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            printStream = new PrintStream(fileOutputStream);
            
            printStream.println("hello world");
            printStream.println(true);
        } catch (Exception e) {
        }
        
        
    }
    
}
