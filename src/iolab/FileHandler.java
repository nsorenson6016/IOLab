/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author nsorenson
 */
public class FileHandler {

    private String[] information = null;

    public String [] readFile(File f) {
        List<String> fields = new ArrayList<String>();
        int i = 0;
        BufferedReader in =null;
        try {
            in = new BufferedReader(new FileReader(f));
            String line = in.readLine();
            while (line != null) {
                fields.add(line);
                i++;
                line = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("We have issues with the file.");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        return fields.toArray(new String[0]);
    }
}
