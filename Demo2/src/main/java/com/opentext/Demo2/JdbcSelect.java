package com.opentext.Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcSelect {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		try {//load the driver
			//driver class:com.mysql.jdbc.Driver
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);
			//get the db connection via driver
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","root", "Pa@9448679770");
			//here opentext is database name,root is username and password --
			//issue the sql query
			
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from emp_info");
			//process the result
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
				try {
					if(con!=null) {
						con.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
		}
		
	}

	}


