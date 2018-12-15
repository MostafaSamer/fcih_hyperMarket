
package hypermarket;

import java.io.Serializable;

public class Person implements Serializable,ILogin{
    	
	protected String name;
	protected String userName;
	protected String pass;
	protected int age;
	protected double SSN;
	protected double salary;
    protected  String Department;
    
    FileBinary FManger = new FileBinary();
    
    
	public Person() {	
		
	}
        			
	public Person(String name, String username, String pass, int age, double ssn, double Salary , String department) {
		
		this.setName(name);
		this.setUserName(username);
		this.setPass(pass);
		this.setAge(age);
		this.setSSN(ssn);
		this.setsalary(Salary);
        this.setdepartment(department);
        
	}
	
    public boolean changePass(String oldPass, String newPass) {
		
		if (oldPass.equals(this.getPass())) {
			
			this.setPass(newPass);
			return true;
			
		}
		return false;
		
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSSN(double sSN) {
		this.SSN = sSN;
	}
	public void setsalary(double Salary) {
		this.salary = Salary;
	}
    public void setdepartment(String department) {
        this.Department=department;
    }
	
	//Getter
	public String getName() {
		return this.name;
	}
	public String getUserName() {
		return this.userName;
	}
	public String getPass() {
		return this.pass;
	}
	public int getAge() {
		return this.age;
	}
	public double getSSN() {
		return this.SSN;
	}
	public double getSalary() {
		return this.salary;
	}
    public String getDepartment() {
        return this.Department;
    }
	
	//LogIN Abstruct
    

    @Override
    public boolean Login(String name, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

     	
 
