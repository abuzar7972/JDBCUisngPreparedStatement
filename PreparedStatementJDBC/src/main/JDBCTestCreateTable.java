package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import utility.JDBCUtil;

public class JDBCTestCreateTable {
	public static void main(String args[]) throws SQLException{
		Connection conn = null;
		//Statement  st = conn.createStatement();
		PreparedStatement preparedStatement = null;
 
		String query = 
				"DROP TABLE abc"+
				"create table abc("
			+ "EMPLOYEE_ID int NOT NULL, "
			+ "NAME VARCHAR(20) NOT NULL, "
			+ "SALARY int NOT NULL, "
			+ "PRIMARY KEY (EMPLOYEE_ID) )";
 
		try{			
			//get connection
			//conn = JDBCUtil.getConnection();
 
			//create preparedStatement
			preparedStatement = conn.prepareStatement(query);
 
			//execute query
			preparedStatement.execute();
 
			//close connection
			preparedStatement.close();
			conn.close();
 
		      System.out.println("Table created successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}