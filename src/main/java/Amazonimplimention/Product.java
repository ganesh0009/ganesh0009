package Amazonimplimention;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	
	private String pronam;
	private int proprice;
	public Product(String pronam, int proprice) {
		
		pronam = pronam;
		this.proprice = proprice;
		
		
		
		
	}
	public String getProName() {
		return pronam;
	}
	public void setProName(String pronam) {
		this.pronam = pronam;
	}
	public int getPrice() {
		return proprice;
	}
	public void setPrice(int proprice) {
		this.proprice = proprice;
	}
	
	public List<String> getproList()
	{
		List<String> productList = new ArrayList<>();
		productList.add("Apple macbook pro");
		productList.add("Apple macbook air");
		productList.add("Apple iphone");
		return productList;
		
		
	}
	

}



