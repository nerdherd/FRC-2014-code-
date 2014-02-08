package nerdHerd.Source;


import com.sun.squawk.microedition.io.FileConnection;
import java.io.DataOutputStream;
import java.io.PrintStream;
import javax.microedition.io.Connector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author student
 */
public class Filer {
    private PrintStream out;
    private DataOutputStream theFile;
    private FileConnection fc;
    private String fileName;

    public Filer(String temp){
        fileName = temp;
    }
    public void connect(){
        try {
   //create a file named "testfile.txt" in the current working directory
            fc = (FileConnection)Connector.open(fileName, Connector.WRITE);
            fc.create();
            theFile = fc.openDataOutputStream();
            out = new PrintStream(theFile);
            } catch (Exception e) {
                
            }
    }
    
    public void println(String line){
        out.println(line);
    }
    
    public void print(String line){
        out.print(line);
    }
    
    public void close(){
        out.close();
    }
}
