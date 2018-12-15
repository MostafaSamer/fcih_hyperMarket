/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import GUI.login;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muhammad
 */
public class HyperMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        String projectpath = System.getProperty("user.dir"); 
        File currentDir = new File(projectpath);
        checkDirectoryContents(currentDir);
        new login().setVisible(true);
       /*Product x = new Product();
       ArrayList<Product> p = new ArrayList<Product>();
       p=x.listAllProduct();
       for(Product u : p)
       {
           System.out.println(u.getName() + u.getPrice() + u.getQuantity()  + u.GetCategory());
       }
        */       
    }
     public static void checkDirectoryContents(File dir) {
    	 
    	 File[] files = dir.listFiles();
         boolean cashiertFileName = true;
         boolean InventoryFileName=true;
         boolean ProductFileName=true;
         boolean MarkterFileName=true;
         
         for (File file : files) {

             if (file.getName().contains("Cashier.bin")) {
                 cashiertFileName = false;
             }
             else if (file.getName().contains("Inventory.bin")) {
                InventoryFileName = false;
             }
             else if (file.getName().contains("Product.bin")) {
                 ProductFileName = false;
             }
             else if (file.getName().contains("Marketer.bin")) {
             	MarkterFileName = false;
             }
         }
      

         if (cashiertFileName) {
            Cashier x = new Cashier();
            x.CommitToFile();
         }
         if (InventoryFileName) {
             Inventory x = new Inventory();
             x.CommitToFile();
         }
         if (ProductFileName) {
              Product x = new Product();
              x.CommitToFile();
         }
         if (MarkterFileName) {
        	 Marketer x = new Marketer();
        	 x.CommitToFile();
         }
    	 
    }
}

    
    

