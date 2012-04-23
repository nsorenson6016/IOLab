package iolab;

import java.io.*;
import java.util.*;

/**
 *
 * @author nsorenson
 */
public class StartUp {

    public static void main(String[] args) { 
        FileHandler fh = new FileHandler();
        Contact c = new Contact();
        List<Contact> contactList = new ArrayList<Contact>();
        
        String [] fields = fh.readFile(new File("/names.txt"));
        for (int i=0;i<fields.length;i++){
            while (!(fields[i].equals("-----"))){
                c.setFirstName(fields[i++]);
                c.setLastName(fields[i++]);
                c.setAddress(fields[i++]);
                c.setCity(fields[i++]);
                c.setState(fields[i++]);
                c.setZip(fields[i++]);
                c.setEmail(fields[i++]);
                c.setPhone(fields[i++]);
            }
            contactList.add(c);
        }
        for (int i = 0;i<contactList.size();i++){
            System.out.println(contactList.get(i));
        }  
    }
}
    


