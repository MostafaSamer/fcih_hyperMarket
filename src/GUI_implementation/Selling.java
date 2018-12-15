package GUI_implementation;

import java.util.ArrayList;

import hypermarket.*;

public class Selling extends Product{

	public ArrayList<Product> GetArray() {
    	LoadFromFile();
    	return product;
        
    }
	
	public void SetArray(ArrayList<Product> x) {
		FManger.write(ProductFilePath,x);
		CommitToFile();
	}
	
	public int GetNumber (String name) {
		
		LoadFromFile();
		for(Product x : product) {
			
			if (name.equals(x.getName())) {
				CommitToFile();
				return x.getQuantity();
			}
		}
		return 0;
		
	}
	public double GetPrice (String name) {
		
		LoadFromFile();
		for(Product x : product) {
			if (name.equals(x.getName())) {
				return x.getPrice();
			}
		}
		CommitToFile();
		return 0;
		
	}
	public void miniProudect(String name,int qua) {
		LoadFromFile();
		for(Product x : product) {
			if (name.equals(x.getName())) {
				x.setQuantity(x.getQuantity()-qua);
			}
		}
		CommitToFile();
		
	}
	public void addProudect(String name,int qua) {
		LoadFromFile();
		for(Product x : product) {
			if (name.equals(x.getName())) {
				x.setQuantity(x.getQuantity()+qua);
			}
		}
		CommitToFile();
		
	}
	
}