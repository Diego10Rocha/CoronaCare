import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;
import java.sql.SQLException;

import Conexao.Conexao;
import Dados.Paciente;
import Persistencia.PacienteDAO;
//import Dados.Paciente;
//import Dados.Usuario;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 0;
		try {
			p = PacienteDAO.getPacienteByNickname("bahea");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);
		
		
		
	/*	String mensagem2 = "https://www.youtube.com/watch?v=mQr7XemLs8s", mensagem = "https://youtu.be/6djjN9qDHTk", link="https://www.youtube.com/embed/";
		boolean cond = false;
		int contador = 0;
		for(int i=0;i<mensagem.length()-1;i++){
			if(mensagem.charAt(i) == '/')
				contador++;
			if(!cond && mensagem.charAt(i) == '=')
				cond = true;
			if(cond){
				link += mensagem.charAt(i+1);
			}
		}
		contador = 0;
		if(!cond){
			for(int i=0;i<mensagem.length()-1;i++){
			
				if(mensagem.charAt(i) == '/')
					contador++;
				if(!cond && contador == 3)
					cond = true;
				if(cond){
					link += mensagem.charAt(i+1);
				}
			}
		}
		
		System.out.println(link);
		
	*/
		
		
		
		
		
		//Usuario user = new Paciente();
		//Conexao.fechar();
		/*try {
			Connection con = Conexao.getConnection();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro!");
		}
		
	
		Connection conexao;
		try {
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/"+"coronacare", "root","root");
			System.out.println("Conectado!");
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
				
	/*			
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
