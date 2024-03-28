/**
 * Author: Ajay
 */
package com.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */
public class inputstream {

	/**
	 * @param argsMar 2, 2024com.CRUDSoprasteriajava
	 */
	
	private static final String input="insert into customer" + "  (name, accNum, contactnum, address, balance) values " + " (?, ?, ?, ?, ?);";

    private static final String delt = "delete from customer where accNum = 130467;";
    
	private static final String Updt = "update customer set name = ? where accNum = ? ";
	
	private static final String selectt = "Select * from customer where name = ?";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 inputstream demo = new inputstream();
	        demo.selecting();
	}
		
	public void inserting() throws SQLException {
		System.out.println(input);
		//Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteriadb","root","Ajay@1909");

            PreparedStatement stmt = con.prepareStatement(input)) {
            stmt.setString(1, "Akshat");
            stmt.setLong(2,123780);
            stmt.setLong(3, 9608909);
            stmt.setString(4,"Gkp");
            stmt.setDouble(5,25000.0);
            

            System.out.println(stmt);
            stmt.executeUpdate();
        }
        catch (Exception e)
        {
        	e.printStackTrace();            
        }
	}
		 
	public void deleting() throws SQLException {
		System.out.println(delt);

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteriadb","root","Ajay@1909");
            Statement statement = con.createStatement();) {

            int result = statement.executeUpdate(delt);
            System.out.println("Number of records affected :: " + result);
        } catch (SQLException e) {

        	e.printStackTrace();            
        }
	}
	
	public void updating() throws SQLException{
		//connection establishment
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteriadb","root","Ajay@1909");
				
				PreparedStatement upd = con.prepareStatement(Updt)){
					upd.setString(1, "Vineet");
					upd.setInt(2, 110467);
					int updRows = upd.executeUpdate();
					if(updRows > 0) {
						System.out.println("Record Updated");
					}
			
		}
		catch (SQLException e) {
			e.printStackTrace();

		}
				
						
	}
	
	public void selecting() throws Exception{
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteriadb","root","Ajay@1909");
				
				PreparedStatement sel = con.prepareStatement(selectt)){
			sel.setString(1, "abhinav");
			
            ResultSet rs = sel.executeQuery();
 
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                int accNum = rs.getInt("accNum");
                int contactnum = rs.getInt("contactnum");
                String address = rs.getString("address");
                double balance = rs.getDouble("balance");
                
                System.out.println(name + "," + accNum + "," + contactnum + "," + address + "," + balance);
            }
			
		}
		catch (Exception e) {
            System.out.println(e);
		}
						
	}

	}

	



