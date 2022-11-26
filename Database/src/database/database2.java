package database;
import java.sql.*;

public class database2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvan","root","password");
			
			Statement smt=con.createStatement();
			//smt.executeUpadate("insert into student123 value(1,"bhuva)");
			int result=smt.executeUpdate("update student123 set id=1,name='bhuvan'");
			System.out.println(result+"row affected");
			con.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
