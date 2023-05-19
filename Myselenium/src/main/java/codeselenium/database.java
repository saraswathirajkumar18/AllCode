package codeselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium_users","root","");
				Statement state=connect.createStatement(); 
				ResultSet result=state.executeQuery("SELECT * from super_heros");
		while(result.next())
			
		{
			System.out.println("Name:"+result.getString("name"));
			System.out.println("Nick Name:"+result.getString("nickname"));
			
		}

	}

}
