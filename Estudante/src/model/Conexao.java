package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConexao() {
		String uri = "jdbc:mysql://localhost:3306/estudante?useSSL=false";
		String username = "root";
		String senha = "12345678";
		
		try {
			return DriverManager.getConnection(uri, username, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
