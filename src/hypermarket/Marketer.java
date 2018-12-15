/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Marketer extends Person{
	
	private final String MrketerFileName="Marketer.bin";
    public static ArrayList<Marketer> Mrketer1 = new ArrayList<Marketer >();
            
    public Marketer () {
                
    }
    public Marketer  (String name, String username, String pass, int age, double ssn, double Salary) {
    	
		this.setName(name);
		this.setUserName(username);
		this.setPass(pass);
		this.setAge(age);
		this.setSSN(ssn);
		this.setsalary(Salary);
		
    }
		
    public boolean  CommitToFile() {
    	
        return (FManger.write(MrketerFileName, Mrketer1));
        
    }
    public void LoadFromFile() {
    	
       Mrketer1  = (ArrayList<Marketer>) FManger.read(MrketerFileName);
       
    }
    
    public int   GetMrketer (String useranme ) {
    	
        for (int i = 0; i < Mrketer1.size(); i++) {
        	
            if (Mrketer1.get(i).getUserName().equals(useranme)) {
                return i;
            }
            
        }

        return -1;
    }
    
    public boolean  AddMrketer () {
    	
        LoadFromFile();
        int index = GetMrketer(this.getUserName());
        if (index==-1) {
        	
        	Mrketer1.add(this);
        	return CommitToFile();
        }
        return false;
    }
    public boolean Updatemarketer (String username) {
    	
        LoadFromFile();
        int index = GetMrketer(userName);
        if (index != -1) {
        	
            Mrketer1.set(index,this);
            return CommitToFile();
            
        }
        return false;
    }
    public boolean  DeleteMrketer (String username) {
    	
        LoadFromFile();
        int index = GetMrketer(username);
        if (index!=-1) {
        	
            Mrketer1.remove(index);
            return CommitToFile();
        }
        
        return false;
        
    }
    public Marketer searchMarkter(String  username) {
    	
    	Marketer temp = new Marketer();
    	LoadFromFile();
        int index = GetMrketer(username);
        if (index != -1) {
            return Mrketer1.get(index);
        } else {
            return temp;
        }
    }
    public ArrayList<Marketer> ListMrketer() {
    	
        LoadFromFile();
        return Mrketer1;
        
    }
       
       
    @Override
    public boolean Login (String username , String pass) {
    	
        LoadFromFile();
        for (Marketer x : Mrketer1 ) {
        	
            System.out.println(x.userName);
            if (username.equals(x.userName)&&pass.equals(x.getPass())) {
            
                return  true;
            }
        }
        return false;
    }
   
}