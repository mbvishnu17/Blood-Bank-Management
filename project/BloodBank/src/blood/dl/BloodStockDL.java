package blood.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import blood.dto.BloodStockDTO;




public class BloodStockDL {
	
	public static int getCount(String blood_grp)
	{
		int result = 0;
		PreparedStatement ps;
		Connection con =null;
		
		
		try
		{
			System.out.println("Inside DL " +blood_grp);
			con = DBHelper.getConnection();	
			String sql = "UPDATE BLOOD_BANK SET COUNT = COUNT+1 WHERE BLOOD_GRP =?"; 
			ps=con.prepareStatement(sql);
			System.out.println(sql);
		    ps.setString(1, blood_grp);
		    result = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("**Error** : BloodStocktDL.getCount "+e.getMessage());
		}
		return result;
		
		
	}
	
	public static int getCountt(String blood_grp)
	{
		int result = 0;
		PreparedStatement ps;
		Connection con =null;
		
		
		try
		{
			System.out.println("Inside DL " +blood_grp);
			con = DBHelper.getConnection();	
			String sql = "UPDATE BLOOD_BANK SET COUNT = COUNT-1 WHERE BLOOD_GRP =?"; 
			ps=con.prepareStatement(sql);
			System.out.println(sql);
		    ps.setString(1, blood_grp);
		    result = ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println("**Error** : BloodStocktDL.getCountt "+e.getMessage());
		}
		return result;
		
		
	}
	
	public static ArrayList<BloodStockDTO> getCounts()
	{
		ArrayList<BloodStockDTO> stocks = null;
		String query;
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		BloodStockDTO stock  = null;
		
		try
		{
			stocks = new ArrayList<BloodStockDTO>();
			query="SELECT * FROM BLOOD_BANK";
			con = DBHelper.getConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			while(resultSet.next())
			{
				stock = new BloodStockDTO();
				
				stock.setBlood_grp(resultSet.getString("Blood_grp"));
				stock.setCount(resultSet.getInt("Count"));
			
				stocks.add(stock);
				
			}
			resultSet.close();
			statement.close();
			con.close();
		}
		catch(Exception e) 
		{
			System.out.println("**Error** : BloodStockDL.getCounts "+e.getMessage());
			
		}
		
		return stocks;
		
	}
}
