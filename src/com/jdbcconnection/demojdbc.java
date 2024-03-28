package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class demojdbc {
	public final String URL="";;
	
	public static final String USER_NAME="";
	
	public static String query="select * from product where id=?";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteriadb","root","Ajay@1909");
		//con.prepareStatement("select * from soprasteriadb");
		//Statement stm=con.createStatement();
		PreparedStatement stm=con.prepareStatement(query);
		stm.setInt(1, 2);
		ResultSet res=stm.executeQuery();
		while(res.next()) {
			int num=res.getInt(1);
			String name=res.getString(2);
			Date db=res.getDate(3);
			System.out.println(num);
			System.out.println(name);
			System.out.println(db);
		} 
		res.close();
	}

}
