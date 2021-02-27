package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	
	public static Connection Faz_conexao() 	throws SQLException{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas","root","Coelhno@442266");
			
		}catch (ClassNotFoundException e ) {
			
			throw new SQLException(e.getException());
			
		}
	}

}
