package GUI_implementation;

import java.io.Serializable;
import java.util.ArrayList;

import hypermarket.*;

public class Store extends Product implements Serializable{ 

	    
	    
	  
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
	    
	    public Product searchForProduct(String name)
	    {
	        LoadFromFile();
	        Store temp = new Store();
	        int index = getIndexOfProduct(name);
	        
	        if(index != -1)
	        {
	            return product.get(index);
	            
	        }
	        temp=null;
	        return temp;
	    }
	    
	    public boolean addProduct()
	    {
	        LoadFromFile();
	        int index = getIndexOfProduct(getName());
	        if (index==-1){
	        product.add(this);
	        
	        return CommitToFile();
	    }
	        return false;
	    }
	    
	    public boolean deleteProduct(String name )
	    {
	        LoadFromFile();
	        
	        int index = getIndexOfProduct(name);
	        
	        if(index != -1)
	        {
	            product.remove(index);
	            return CommitToFile();
	        }
	        
	        return false;
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
	    
	    public ArrayList<Product> listAllProduct()
	    {
	        LoadFromFile();
	        return product;
	    }
}