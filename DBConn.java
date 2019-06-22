package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	public static Connection connector() {
		try {
			
			String url = "jdbc:mariadb://211.110.165.201:3306/bsit20190518_5";
			String id = "id_5";
			String pw = "pw_5";
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			if(con != null) {
				System.out.println("DB에 접속 성공함.");
				return con;
				
			}
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
