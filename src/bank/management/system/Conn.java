package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	Connection conn;
	Statement s;
	
 
	public Conn() {
		try {
			// register drive (inbuilt no need to do this now)
			// establish connection with DB
			String url = "jdbc:mysql://localhost:3306/";
			String db ="BankMangementSystem";
			String user = "root";
			String password ="Reet238@";
			 conn = DriverManager.getConnection(url+db ,user , password);
			 s = conn.createStatement();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
