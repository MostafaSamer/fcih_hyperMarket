/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.util.ArrayList;


/**
 *
 * @author Muhammad
 */
public class Admin extends Person{
   
    @Override
    public boolean Login (String username , String pass) {
    	
    	if (username.equals("Admin")&&pass.equals("123")) {
            
            return  true;
       }
          
       return false;
    	
    }

    
}
