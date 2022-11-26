package database;
import java.sql.*;

public class database5 {
	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvan","root","password");
		    String query="insert into student123 value(?,?)";
		    CallableStatement cs =con.prepareCall(query);
		    cs.setInt(1,12);
		    cs.setString(2, "adi");
		    int result=cs.executeUpdate();
		    System.out.println(result);
		    
			
		
		}catch(Exception e) {}
	}

}
