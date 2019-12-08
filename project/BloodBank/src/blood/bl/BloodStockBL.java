package blood.bl;

import java.util.ArrayList;

import blood.dl.BloodStockDL;

import blood.dto.BloodStockDTO;



public class BloodStockBL {
	

	
	public static int getCount(String blood_grp)
	{
		int result = 0;
       

		try
		{
			result = BloodStockDL.getCount(blood_grp);
			
		}
		catch(Exception e)
		 {
			 System.out.println("**Error** : BloodStocktBL.get "+e.getMessage());
		 }
		return result;
	
	}
	
	public static int getCountt(String blood_grp)
	{
		int result = 0;
       

		try
		{
			result = BloodStockDL.getCountt(blood_grp);
			
		}
		catch(Exception e)
		 {
			 System.out.println("**Error** : BloodStocktBL.get "+e.getMessage());
		 }
		return result;
	
	}
	
	public static ArrayList<BloodStockDTO> getCounts() {

		ArrayList<BloodStockDTO> stocks = null;

		try {
			stocks = BloodStockDL.getCounts();
		}

		catch (Exception e) {
			System.out.println("**Error** :  BloodStockBL.getCounts " + e.getMessage());

		}

		return stocks;
	}

	
}
