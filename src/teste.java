import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

import Conexao.Conexao;
//import Dados.Paciente;
//import Dados.Usuario;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Usuario user = new Paciente();
		Conexao.fechar();
		try {
			Connection con = Conexao.getConnection();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro!");
		}
		
		/*
		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/"+"coronacare", "root","root"+ "?serverTimezone=UTC");
				System.out.println("Conectado!");
				conexao.close();
				
		try {
			DriverManager.getConnection(
			"jdbc:mysql://localhost/coronacare", "root", "root");
			System.out.println("ok!");
			} catch (SQLException e) {
			throw new RuntimeException(e);
			}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+"coronacare", "root","root"+ "?serverTimezone=UTC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    
	}

}
