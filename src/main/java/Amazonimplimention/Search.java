package Amazonimplimention;



public class Search {
	
	public String displayproduct(Product pro)
	{
		if(pro.getproList().contains(pro.getProName())) 
		{
			return pro.getProName();
			
		}
		return null;
		
	}


}
