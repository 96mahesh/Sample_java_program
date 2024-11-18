package JDBCConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Step2 {

	public static void main(String[] args) throws SQLException {
		 String DB_URL = "jdbc:mysql://localhost/tp";
		 String USER = "root";
		 String PASS = "Power@123";
		 int id = 0;
		 String name = "";
		 int no = 0;
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			String quary = "insert into cricket values(11,'Mahesh',15)";
			stmt.execute(quary);
			String tab = "Select * from cricket";
			ResultSet rs = stmt.executeQuery(tab);
			while(rs.next()) {
				id = rs.getInt(1);
				name = rs.getString(2);
				no = rs.getInt(3);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		 System.out.println(id+" "+name+" "+no);
	}
}
