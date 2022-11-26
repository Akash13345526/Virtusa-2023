package database;
import java.sql.*;

public class database4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvan","root","password");
			//PreparedStatement pps=con.prepareStatement("update student123 set id=? where name=?");
			//PreparedStatement pps=con.prepareStatement("delete from student123 where name=?");
			//pps.setString(1,"bhuvan");
			//pps.setInt(1,2);
		//	int i=pps.executeUpdate();

			//System.out.println(i+"row is affected");
			
			PreparedStatement pps=con.prepareStatement("select *from student123");
			ResultSet rs=pps.executeQuery();
			//ResultSetMetaDate rsmd=rs.getMetaData();
			ResultSetMetaData rsmd=rs.getMetaData();  
			System.out.println("total no of column"+rsmd.getColumnCount());
			System.out.println(rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnName(1));
			
			
		//	con.close();
			
			
		}catch(Exception e) {System.out.println(e);
			
		}
		
	}
	

}
