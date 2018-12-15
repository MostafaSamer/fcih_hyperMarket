/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileBinary implements Serializable{
    
    public boolean write(String FilePath, Object data) {

        try {

            try (ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(FilePath))) {
            	
                writter.writeObject(data);

            }
            return true;

        } catch (IOException e) {
            System.out.println("Can't write ...!\n" + e);
        }

        return false;
    }

    public Object read(String FilePath) {

        Object Result = null;

        try {
            
            try (ObjectInputStream Reader = new ObjectInputStream(new FileInputStream(FilePath))) {
                Result = Reader.readObject();
            }
            

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileBinary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Result;

    }
    
}
