package com.opentext.Demo2;
import java.sql.*;
import java.util.*;
import com.mysql.jdbc.Driver;

public class JdbcPreStmt {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pt=null;
		ResultSet rt=null;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the age");
		int age=s.nextInt();
		
		
		try {
			Driver dr=new Driver();
			DriverManager.registerDriver(dr);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","root","Pa@9448679770");
			pt=con.prepareStatement("select name from emp_info where id=? and age=?");
			pt.setInt(1, id);
			pt.setInt(2, age);
			
			rt=pt.executeQuery();
			if(rt.next()) {
				String name=rt.getString(1);
				System.out.println(name);
			}
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
				pt.close();}
			
			if(rt!=null) {
				rt.close();
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			

		}
		
	}

}
