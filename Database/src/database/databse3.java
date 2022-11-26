package database;
import java.sql.*;

public class databse3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvan","root","password");
			Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=smt.executeQuery("select*from student123");
			rs.absolute(2);
			System.out.print(rs.getInt(1)+"|"+rs.getString(2));
;
			con.close()
;			
			
		}catch(Exception e) {
			
		}
	}

}
