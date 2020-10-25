package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	private static Connection con = null;
	// private static final String servidor = "db4free.net:3306";
	private static final String servidor = "localhost";
	private static final String basedados = "coronacare";
	// private static final String usuario = "coronacare";
	private static final String usuario = "root";
	// private static final String senha = "coronacare";
	private static final String senha = "root";

	public static Connection getConnection() throws SQLException {
		try {
			new com.mysql.jdbc.Driver();
			con = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + basedados, usuario, senha);
			System.out.println("Conecatado!");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void fechar() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ResultSet receberDados(String SQL) {
		ResultSet dados = null;

		try {
			Statement st = con.createStatement();
			dados = st.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dados;
	}

	public static void enviarDados(String SQL) {
		try {
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, 1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
