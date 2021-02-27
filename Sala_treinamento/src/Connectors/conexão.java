package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexâo {
	
	
	public static Connection Faz_Conecção() throws SQLException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas","root", "Coelho@442266");
		
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());
		}
		
	}

	}	
