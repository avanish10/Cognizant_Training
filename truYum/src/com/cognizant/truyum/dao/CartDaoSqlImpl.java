package com.cognizant.truyum.dao;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;



public class CartDaoSqlImpl  implements CartDao{
	

	
	public void addCartItem(long userId, Long menuItemId) 
	{
		Connection con = ConnectionHandler.getConnection();
		String Query = "insert into cart(customerid,productid)"+"values (?,?) ";
		long cartid = 1;
		try 
		{
			
			PreparedStatement stmt = con.prepareStatement(Query);
			stmt.setLong(1, userId);
			stmt.setLong(2, menuItemId);
			stmt.execute();
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

	
	public ArrayList getAllCartItems(long userId) throws CartEmptyException {
		
		Connection con = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		
		Cart cart = new Cart(0,menuItemList);
		String query = "select * from menu_item JOIN cart ON menu_item.id = cart.productid where cart.customerid = ?";
		try
		{
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, userId);
			ResultSet rs = stmt.executeQuery();
			float value  = 0.00f;
			while(rs.next())
			{
				long id = rs.getLong("id");
				String name  = rs.getString("Name");
				float price = rs.getFloat("Price");
				value = value + price;
				String active = rs.getString("Active");
				Date date1 = rs.getDate("Date_of_launch");
				String category = rs.getString("Category");
				String free_delivery = rs.getString("Free_delivery");
				boolean act = false;
				if(active.equalsIgnoreCase("yes"))
				{
					act = true;
				}
				boolean free=false;
				if(free_delivery.equalsIgnoreCase("yes"))
				{
					free = true;
				}
				MenuItem m1  = new MenuItem(id,name,category,price,act,free,date1);
				menuItemList.add(m1);
				
			}
			//total =  value;
			cart.setTotal(value);
			cart.setMenuItemList(menuItemList);
			
			
			
			
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
	
		return menuItemList;
	}
	public double getTotal() {
		
	  Cart c = new Cart();
	  return c.getTotal();
	  
		
	}
	
	
	
	public void removeCartItem(long userId, long menuItemId)
	{
		Connection con = ConnectionHandler.getConnection();
		String query = "delete from  cart where customerid = ? AND productid = ?";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1,userId);
			stmt.setLong(2, menuItemId);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
