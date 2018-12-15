/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.util.ArrayList;


public class Inventory extends Person {
	
    private final String InventoryFileName="Inventory.bin";
    public static ArrayList <Inventory> inventory = new ArrayList<Inventory>();
            
    public Inventory () {
                
    }
    
    public Inventory  (String name, String username, String pass, int age, double ssn, double Salary) {
    	
		this.setName(name);
		this.setUserName(username);
		this.setPass(pass);
		this.setAge(age);
		this.setSSN(ssn);
		this.setsalary(Salary);
		
    }
		
    public boolean  CommitToFile() {
    	
        return (FManger.write(InventoryFileName,inventory));
        
    }
    public void LoadFromFile() {
    	
        inventory = (ArrayList<Inventory>) FManger.read(InventoryFileName);
        
    }
    
    public int GetInventory (String useranme ) {
    	
        for (int i = 0; i < inventory.size(); i++) {
        	
            if (inventory.get(i).getUserName().equals(useranme)) {
            	
                return i;
                
            }
            
        }

        return -1;
    }
    
    public boolean  AddInventory ()  {
    	
        LoadFromFile();
        int index = GetInventory(this.getUserName());
        Exception myex= new Exception();
        if (index==-1) {
        	
        	if (myex.ExAge(getAge())&& myex.ExSSN(getSSN()) && myex.ExName(getName()) && myex.ExPass(getPass()) && myex.ExSalary(getSalary()) && myex.ExUsername(getUserName())) {
        		
        		inventory.add(this);
        		return CommitToFile();
            
        	}
        	
        }
        
       return false;
    }
    
    public boolean UpdateInventory(String username) {
    	
        LoadFromFile();
        int index = GetInventory(userName);
        if (index != -1) {
        	
        	inventory.set(index,this);
            return CommitToFile();
            
        }
        
        return false;
        
    }
    
    public boolean  DeleteInventory (String username) {
    	
        LoadFromFile();
        int index = GetInventory(username);
        if (index!=-1) {
        	
           inventory.remove(index);
           return CommitToFile();
        }
        
        return false;
        
    }
    
    public Inventory searchInventory(String  username) {
    	
        Inventory temp = new Inventory();
        LoadFromFile();
        int index = GetInventory(username);
        if (index != -1) {
        	
            return inventory.get(index);
            
        } else {
        	
            return temp;
            
        }
    }
    
    public ArrayList<Inventory> ListInventory() {
    	
        LoadFromFile();
        return inventory;
        
    }
       
       
    @Override
       public boolean Login (String username , String pass)
       {
           LoadFromFile();
          for (Inventory x : inventory )
           {
               System.out.println(x.userName);
            if (username.equals(x.userName)&&pass.equals(x.getPass()))
            {
                
                return  true;
            }
           }
        return false;
       }

}
