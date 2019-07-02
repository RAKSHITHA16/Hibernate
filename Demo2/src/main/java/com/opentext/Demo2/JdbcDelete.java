package com.opentext.Demo2;
import java.sql.*;
import com.mysql.jdbc.Driver;


public class JdbcDelete {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rt=null;
		
		try {
			Driver dr=new Driver();
			DriverManager.registerDriver(dr);
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","root","Pa@9448679770");
			st=con.createStatement();
			int y=st.executeUpdate("delete from department_info where dept_id=8");
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
				if(st!=null) {
					st.close();
				}
				if(rt!=null) {
					rt.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
