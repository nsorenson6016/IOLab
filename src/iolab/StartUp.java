package iolab;

import java.io.*;

/**
 *
 * @author nsorenson
 */
public class StartUp {

    public static void main(String[] args) {
//        File data = new File("J" + File.separatorChar + "names.txt");
//        
//        BufferedReader in = null;
//        
//        try{
//            new BufferedReader(new FileReader(data));
//            String line = in.readLine();
//            while (line != null){
//		  System.out.println(line);
//		  line = in.readLine();  
//	   }
//        } catch (IOException ioe){
//            System.out.println("We have issues.");
//        } finally {
//            try {
//                in.close();
//            } catch (Exception e){}
//        }
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("J:/names.txt");
            int c;
            
            while ((c = in.read()) != -1) System.out.println(c);
        } catch (IOException ioe){
            System.out.println("Boo!");
        } finally {
            try {in.close();}
            catch (Exception e){}
        }
        
    }
        
    }
    


