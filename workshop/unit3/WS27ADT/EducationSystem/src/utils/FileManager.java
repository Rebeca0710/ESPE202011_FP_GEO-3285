/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class FileManager {
    
    public static boolean createFile(String fileName){
        boolean created = false;
        try{
            File file =new File(fileName + ". txt");
            if (file.createNewFile()){
                System.out.println("file was created");
                
                created = true;
            }else{
                System.out.println("file already exists");
                created = false;
            }    
        } catch(IOException ex){
            ex.printStackTrace();
            created = false;
        }
        return created;
    }
    
    public static boolean save(String data, String fileName){
        boolean saved = false;
        
        createFile(fileName);
        
        try{
            FileWriter myWrite = new FileWriter(fileName + ". csv", true);
            myWrite.write(data + System.getProperty("line.separator"));
            myWrite.close();
            System.out.println(" a new record of " + fileName + "was saved");
            saved = true;            
        }catch (IOException ex){
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }
   public StringBuffer readFile(String filename){
   StringBuffer sb = new StringBuffer();
   try{
      File file = new File(filename);
      String line = null;
      BufferedReader br = new BufferedReader(new FileReader(file));
      while ((line = br.readLine()) != null) {
         sb.append(line);
       }
      br.close();
    } catch (FileNotFoundException fnfe){
          System.out.println("No ha sido posible encontrar el archivo "+ filename);
    }
   catch (IOException ioe){
       System.out.println("Se ha producido un error durante la lectura del archivo "+ filename);
    }
   return sb;
    }
}  
       


