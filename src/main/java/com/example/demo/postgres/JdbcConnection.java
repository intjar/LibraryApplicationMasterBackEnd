/*package com.example.demo.postgres;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {

	private static Connection con = null;

	static {
		try {
			Properties p = new Properties();
			java.net.URL fileurl = ClassLoader.getSystemResource("application.properties");
			p.load(fileurl.openStream());

			String url = p.getProperty("spring.datasource.url");
			String user = p.getProperty("spring.datasource.username");
			String pass = p.getProperty("spring.datasource.password");
	
				
			String url = "jdbc:postgresql://10.247.141.197:5432/mhrd_pgi_report";
			String user = "postgres";
			String pass = "postgresdemo";

			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
*/

package com.example.demo.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private static Connection con = null;

	static {
		System.out.println("Inside Connection 1 ");

//	       String url = "jdbc:postgresql://localhost:5432/pgi_report";
//	       String user = "postgres";
//	       String pass = "postgres";

			String url = "jdbc:postgresql://10.247.141.197:5432/mhrd_pgi_report";
			String user = "postgres";
			String pass = "postgresdemo";

//          String url = "jdbc:postgresql://10.247.141.217:5432/mhrd_pgi_report";
//	        String user = "pgi_user";
//	        String pass = "postgresdemo";

		try {
			System.out.println("Inside Connection 2 ");
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.out.println("Inside Connection 3 ");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		return con;
	}

}
