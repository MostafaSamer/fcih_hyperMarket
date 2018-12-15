/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypermarket;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
	
    protected String Name;
    protected int Quantity;
    protected String Category;
    protected  double Price;
    protected boolean damaged = false;
    
    protected FileBinary FManger  = new FileBinary();
    
    protected final String ProductFilePath = "Product.bin";
    
    protected static ArrayList<Product> product = new ArrayList<Product>(); 
    
    public Product() {
        
    }
    
    public Product(String name, int Quantity, double price , String Category) {
    	
        this.Name = name;
        this.Quantity =Quantity;
        this.Price = price;
        this.Category=Category;
        
    }

    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
    }

    public void setQuantity(int Quantity)
    {
        this.Quantity =Quantity;
    }
    
    public int getQuantity()
    {
        return Quantity;
    }

    public void setPrice(double price) 
    {
        this.Price = price;
    }

    public double getPrice()
    {
        return Price;
    }
    public void SetCategory(String Category)
    {
        this.Category=Category;
    }
    public String GetCategory()
    {
        return this.Category;
    }
    
    
    //to create file 
      
    public boolean  CommitToFile() {
    	
        return (FManger.write(ProductFilePath,product));
        
    }
    public void LoadFromFile() {
    	
    	product = (ArrayList<Product>) FManger.read(ProductFilePath);
        
    }
    // Commen in Store and proudect
    public int getIndexOfProduct(String name)
    {
        for(int i = 0; i < product.size(); i++)
        {
            if(product.get(i).getName().equals(name))
            {
                return i;
            }
        }
        
        return -1;
    }
    public boolean updateProduct()
    {
        LoadFromFile();
        int index = getIndexOfProduct(getName());
        if(index !=-1)
        {
            product.set(index,this);
            return CommitToFile();
        }
                
        return false;
    }
}