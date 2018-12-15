
package hypermarket;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.*;

public class Cashier extends Person implements Serializable{
	
    private final String cashiertFileName="Cashier.bin";
    
    public static ArrayList<Cashier> cashiers = new ArrayList<Cashier>();
            
    public Cashier () {
                
    }
    public Cashier  (String name, String username, String pass, int age, double ssn, double Salary) {
    	
		this.setName(name);
		this.setUserName(username);
		this.setPass(pass);
		this.setAge(age);
		this.setSSN(ssn);
		this.setsalary(Salary);
		
    }
		
    public boolean CommitToFile() {
    	
        return (FManger.write(cashiertFileName, cashiers));
        
    }
    
    public void LoadFromFile() {
    	
        cashiers = (ArrayList<Cashier>) FManger.read(cashiertFileName);
        
    }
    
    public int GetCashier (String useranme) {
    	
        for (int i = 0; i < cashiers.size(); i++) 
        {
            if (cashiers.get(i).getUserName().equals(useranme)) {
                return i;
            }
        }

        return -1;
        
    }
    
    public boolean AddCashier () {
    	
        LoadFromFile();
        int index = GetCashier(this.getUserName());
        Exception myex = new Exception();
        if (index==-1) {
        	
        	if (myex.ExAge(getAge())&& myex.ExSSN(getSSN()) && myex.ExName(getName()) && myex.ExPass(getPass()) && myex.ExSalary(getSalary()) && myex.ExUsername(getUserName())) {
        	
        		cashiers.add(this);
        		return CommitToFile();
        		
        	}   

        }
        
        return false;
       
    }
    
    public boolean UpdateCashier (String username) {
    	
        LoadFromFile();
        int index = GetCashier(username);
        if (index!=-1) {
        	
            cashiers.set(index,this);
            return CommitToFile();
            
        }
        
        return false;
        
    }
    
    public boolean  DeleteCashier (String username) {
    	
        LoadFromFile();
        int index = GetCashier(username);
        if (index!=-1) {
        	
            cashiers.remove(index);
           return CommitToFile();
           
        }
        
        return false;
        
    }
    
    public Cashier searchCashier(String  username) {

    	Cashier temp = new Cashier();
    	LoadFromFile();
        int index = GetCashier(username);
        if (index != -1) {
        	
            return cashiers.get(index);
            
        } else {
        	
            return temp;
            
        }
        
    }
    
    public ArrayList<Cashier> ListCashier() {
    	
        LoadFromFile();
        return cashiers;
        
    }
       
       
    @Override
       public boolean Login (String username , String pass) {
    	
          LoadFromFile();
          for (Cashier x : cashiers ) {
        	  
               //System.out.println(x.userName);
               if (username.equals(x.userName)&&pass.equals(x.getPass())) {
                
                return  true;
                
               }
               
           }
          
          return false;
          
       }
}