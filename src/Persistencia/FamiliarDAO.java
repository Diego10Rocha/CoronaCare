package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexao.Conexao;
import Dados.Familiar;
import Dados.Paciente;

public class FamiliarDAO {
	public static Familiar getFamiliar(int Id) {
		Familiar f = null;
		ResultSet rs;
		
		Conexao.conectar();
		
		rs = Conexao.receberDados("select * from Familiar where id_Familiar = " + Id);
		try {
			rs.next();
			f = new Familiar();
			f.setIdUsuario(rs.getInt("id_Familiar"));
			f.setNomeUsuario(rs.getString("nomeFamiliar"));
			f.setData_Nascimento(rs.getString("dataNascFamiliar"));
			f.setTelefoneUsuario(rs.getString("telefoneFamiliar"));
			f.setTelefoneUsuario(rs.getString("senhaFamiliar"));
			f.setTelefoneUsuario(rs.getString("emailFamiliar"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Conexao.fechar();
		
		return f;
	}
	
	public static ArrayList <Paciente> getPacientes(int id){
		ArrayList <Paciente> pacientes = new ArrayList<Paciente> ();
		Paciente p = null;
		ResultSet rs;
		
		Conexao.conectar();
		
		rs = Conexao.receberDados("select * from vPacientesFamiliar where id_Familiar = " + id);
		try {
			while(rs.next()) {
				p = new Paciente();
				p.setIdUsuario(rs.getInt("id_Paciente"));
				p.setNomeUsuario(rs.getString("nomePaciente"));
				p.setData_Nascimento(rs.getString("dataNascPaciente"));
				p.setTelefoneUsuario(rs.getString("telefonePaciente"));
				p.setTelefoneUsuario(rs.getString("senhaPaciente"));
				p.setTelefoneUsuario(rs.getString("emailPaciente"));
				p.setNickname(rs.getString("nickname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Conexao.fechar();
		
		return pacientes;
	}
	
	public static Familiar loginFamiliar(String email, String password) {
		Familiar f = null;
		ResultSet rs;
		
		Conexao.conectar();
		
		rs = Conexao.receberDados("select * from Familiar where emailFamiliar = " + email + " and senhaFamiliar = "+password);
		try {
			rs.next();
			f = new Familiar();
			f.setIdUsuario(rs.getInt("id_Familiar"));
			f.setNomeUsuario(rs.getString("nomeFamiliar"));
			f.setData_Nascimento(rs.getString("dataNascFamiliar"));
			f.setTelefoneUsuario(rs.getString("telefoneFamiliar"));
			f.setTelefoneUsuario(rs.getString("senhaFamiliar"));
			f.setTelefoneUsuario(rs.getString("emailFamiliar"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			f = null;
		}
		
		Conexao.fechar();
		
		return f != null ? f : null;
	}
	
	public static void deleteFamiliar(int Id) {
		Conexao.conectar();
		Conexao.enviarDados("delete from Familiar where id_Familiar = " + Id);
		Conexao.fechar();
	}
	
	public static void insertFamiliar(Familiar f) {
		Conexao.conectar();
		Conexao.enviarDados("insert into Paciente(nomeFamiliar, emailFamiliar, senhaFamiliar, dataNascFamiliar, telefoneFamiliar)"
				+ "values ('" + f.getNomeUsuario() + "','" + f.getEmailUsuario()+ "', '" + f.getSenhaUsuario() 
				+"', '" + f.getData_Nascimento() +"', '" + f.getTelefoneUsuario()+"')");
		Conexao.fechar();
	}
	
	public static void updateFamiliar(Familiar f) {
		Conexao.conectar();
		Conexao.enviarDados("update Familiar set nomeFamiliar = '" + f.getNomeUsuario() + "', emailFamiliar ='" + f.getEmailUsuario() 
		+ "', dataNascPaciente ='" + f.getData_Nascimento() + "', telefoneFamiliar ='" + f.getTelefoneUsuario() + "', senhaFamiliar ='" 
				+ f.getSenhaUsuario() + "' where id_Familiar = " + f.getIdUsuario());
		Conexao.fechar();
	}

}
