package com.opentext.Demo2;
import java.sql.*;
import com.mysql.jdbc.Driver;

public class JdbcUpdate {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rt=null;
		
		Driver dr;
		try {
			dr = new Driver();
	DriverManager.registerDriver(dr);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opentext","root","Pa@9448679770");
	st=con.createStatement();
	int y=st.executeUpdate("update department_info set dept_name='ghgh' where dept_id=8");
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
				st.close();}
			
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
