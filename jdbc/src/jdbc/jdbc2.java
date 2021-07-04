package jdbc;

import java.sql.DriverManager;
import java.sql.*;

public class jdbc2 {
	
	public static void main(String[] args)
	{
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Singhal10@");
			if(con!=null)
			{
				System.out.println("Connected Successfully");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}

}
