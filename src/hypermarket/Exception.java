/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import javax.swing.JOptionPane;
/**
 *
 * @author Muhammad
 */
public class Exception {
	
    public boolean ExAge(int age) {
    	
		if(age>16) {
			
            return true;
            
		}
        else {
        	
            JOptionPane.showMessageDialog(null, "Age mustn't be greater than 16", "Numbers", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
		
	}
    
	public boolean ExPass(String pass) {
		
		if(pass.length()>4) {
			
			return true;

		}
        else {
        	
             JOptionPane.showMessageDialog(null, "Pass length must be greater than 4", "Numbers", JOptionPane.ERROR_MESSAGE);
             return false;
                 
       }
		
	}
	
	public 	boolean ExSalary (double salary) {
		
		if (salary>200) {
			
            return true;
            
        }
        else {
        	
            JOptionPane.showMessageDialog(null, "Salary mustn't be 200", "Numbers", JOptionPane.ERROR_MESSAGE);
            return false;
            
       }
		
	}
	public boolean ExName (String name) {
		
		if(name.length()>4) {
			
            return true;
            
        } else {
        	
            JOptionPane.showMessageDialog(null, "Name length must be bigger than 4", "Numbers", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
		
	}
	public boolean ExUsername (String username ) {
		
		if(username.length()>2) {
			
            return true;
            
        } else {
        	
            JOptionPane.showMessageDialog(null, "Username length must be bigger than 4", "Numbers", JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
		
	}
	
	public boolean ExSSN(double SSN) {
		
		if(SSN>0) {
			
			return true;
        } else {
        	
            JOptionPane.showMessageDialog(null, "SSN mustn'y be 0", "Numbers", JOptionPane.ERROR_MESSAGE);
            return false;
            
            }
		
	}
	public boolean isNumber(String sen) {
		
		try {
			Double.parseDouble(sen);
			return true;
		} catch(NumberFormatException nfe) {
			return false;
		}
		
	}
        
        
        ////////////////////////
                //////////////////
        
        public boolean ExNameproduct(String x)
        {
            if (!x.equals(""))
            {
                return true;
            }
            else 
            {
                 JOptionPane.showMessageDialog(null, "Name Feild is Empty", "Numbers", JOptionPane.ERROR_MESSAGE);
                 return false;   
            }
        }
        public boolean  ExQuantity (int x )
        {
                if (x!=0)
            {
                return true;
            }
            
            else 
            {
                 JOptionPane.showMessageDialog(null, "Quantity Feild is Empty", "Numbers", JOptionPane.ERROR_MESSAGE);
                 return false;   
        }
        }
        public boolean ExPrice (int x )
        {
                   if (x!=0)
            {
                return true;
            }
            
            else 
            {
                 JOptionPane.showMessageDialog(null, "Price Feild is Empty", "Numbers", JOptionPane.ERROR_MESSAGE);
                 return false;   
        }  
        }
           public boolean ExCategory(String x)
        {
            if (!x.equals(""))
            {
                return true;
            }
            else 
            {
                 JOptionPane.showMessageDialog(null, "Category Feild is Empty", "Numbers", JOptionPane.ERROR_MESSAGE);
                 return false;   
            }
        }

        
        
    
}
