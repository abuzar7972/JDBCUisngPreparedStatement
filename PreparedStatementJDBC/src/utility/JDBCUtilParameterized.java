package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtilParameterized {
	//JDBC and database properties.
		private static final String DB_DRIVER = 
			           "oracle.jdbc.driver.OracleDriver";
		private static final String DB_URL = 
			        "jdbc:oracle:thin:@localhost:1521:XE";
		private static final String DB_USERNAME = "root";
		private static final String DB_PASSWORD = "Pass@@123";
	 
		public static Connection getConnection(){
			Connection conn = null;
			try{
				//Register the JDBC driver
				Class.forName(DB_DRIVER);
	 
				//Open the connection
				conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	 
				if(conn != null){
				   System.out.println("Successfully connected.");
				}else{
				   System.out.println("Failed to connect.");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			return conn;
		}	
}
