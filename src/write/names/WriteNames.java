/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package write.names;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tfranz
 */
public class WriteNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Path n1 = Paths.get("C:/Users/tfranz/Desktop");
        try(BufferedReader br = new BufferedReader(new FileReader("BoyNames.txt")))
        {
            FileWriter nameOut = new FileWriter("NewBoyNames.txt");
            PrintWriter out = new PrintWriter(nameOut);
            StringBuilder fileNames = new StringBuilder();
            String name = br.readLine();
            
            while (name != null) {
                fileNames.append(name);
                fileNames.append(System.lineSeparator());
                out.printf(name);
                out.printf("\n");
                name = br.readLine();
            }
            out.close();           
        }
       catch (IOException e)
        {
            System.out.println("No file was found");
            
        }
       
      
    }
    
}
