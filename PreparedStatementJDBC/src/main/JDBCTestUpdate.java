package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import utility.JDBCUtil;

public class JDBCTestUpdate {
	public static void main(String args[]){
		Connection conn = null;
		PreparedStatement preparedStatement = null;
 
		String query = "update EMPLOYEE set " +
		"SALARY = ? " + 
		"where EMPLOYEE_ID = ? ";
 
		try{			
			//get connection
			conn = JDBCUtil.getConnection();
 
			//create preparedStatement
			preparedStatement = conn.prepareStatement(query);
 
			//set values
			preparedStatement.setInt(2, 1);
			preparedStatement.setInt(1, 65000);
 
			//execute query
			preparedStatement.executeUpdate();
 
			//close connection
			preparedStatement.close();
			conn.close();
 
		      System.out.println("Record updated successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	

}
