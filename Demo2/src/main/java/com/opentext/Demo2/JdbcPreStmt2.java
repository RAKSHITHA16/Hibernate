package com.opentext.Demo2;
import java.sql.*;
import com.mysql.jdbc.Driver;
import java.util.*;

public class JdbcPreStmt2 {
	public static void main(String[] args) {
		Connection con=null;
	   PreparedStatement pt=null;
	   ResultSet rt=null;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the id");
	   int id=s.nextInt();
	   System.out.println("enter the name");
	   String name=s.next();
	   
	   
	   
	   try {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","root","Pa@9448679770");
		pt=con.prepareStatement("insert into department_info values (?,?)");
		pt.setInt(1, id);
		pt.setString(2, name);
		int y=pt.executeUpdate();
		System.out.println(y);
				
	} 
	   
	   
	   
	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally {
		   try {
				if(con!=null) {
					con.close();
				}
				if(pt!=null) {
					pt.close();
				}
				if(rt!=null) {
					rt.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}
	   }
	   
	}


