package dados;

import java.sql.*;



public class ConexaoFactory {
	public Connection getConnection() {
	try {
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
		
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/sistemaescolar", "root", "mf1234567*");
		
		return conexao;
		
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}