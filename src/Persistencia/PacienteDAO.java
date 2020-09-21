package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;
import Dados.Paciente;

public class PacienteDAO {
	public static Paciente getPaciente(int Id) {
		Paciente p = null;
		ResultSet rs;
		
		Conexao.conectar();
		
		rs = Conexao.receberDados("select * from Paciente where id_Paciente = " + Id);
		try {
			rs.next();
			p = new Paciente();
			p.setIdPaciente(rs.getInt("id_Paciente"));
			p.setNomePaciente(rs.getString("nomePaciente"));
			p.setData_Nascimento(rs.getString("dataNascPaciente"));
			p.setTelefonePaciente(rs.getString("telefonePaciente"));
			p.setTelefonePaciente(rs.getString("senhaPaciente"));
			p.setTelefonePaciente(rs.getString("emailPaciente"));
			p.setNickname(rs.getString("nickname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Conexao.fechar();
		
		return p;
	}
	
	public static Paciente loginPaciente(String email, String password) {
		Paciente p = null;
		ResultSet rs;
		
		Conexao.conectar();
		
		rs = Conexao.receberDados("select * from Paciente where emailPaciente = " + email + " and senhaPaciente = "+password);
		try {
			rs.next();
			p = new Paciente();
			p.setIdPaciente(rs.getInt("id_Paciente"));
			p.setNomePaciente(rs.getString("nomePaciente"));
			p.setData_Nascimento(rs.getString("dataNascPaciente"));
			p.setTelefonePaciente(rs.getString("telefonePaciente"));
			p.setTelefonePaciente(rs.getString("senhaPaciente"));
			p.setTelefonePaciente(rs.getString("emailPaciente"));
			p.setNickname(rs.getString("nickname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			p = null;
		}
		
		Conexao.fechar();
		
		return p != null ? p : null;
	}
	
	public static void deletePaciente(int Id) {
		Conexao.conectar();
		Conexao.enviarDados("delete from Paciente where id_Paciente = " + Id);
		Conexao.fechar();
	}
	
	public static void insertPaciente(Paciente p) {
		Conexao.conectar();
		Conexao.enviarDados("insert into Paciente(nomePaciente, nickname, emailPaciente, senhaPaciente, dataNascPaciente, telefonePaciente)"
				+ "values ('" + p.getNomePaciente() + "','" + p.getNickname() + "', '" + p.getEmailPaciente()+ "', '" 
				+ p.getSenhaPaciente() +"', '" + p.getData_Nascimento() +"', '" + p.getTelefonePaciente()+"')");
		Conexao.fechar();
	}
	
	public static void updatePaciente(Paciente p) {
		Conexao.conectar();
		Conexao.enviarDados("update Paciente set nomePaciente='" + p.getNomePaciente() + "', emailPaciente ='" + p.getEmailPaciente() 
		+ "', dataNascPaciente ='" + p.getData_Nascimento() + "', telefonePaciente='" + p.getTelefonePaciente() + "', senhaPaciente='" 
				+ p.getSenhaPaciente() +"',nickname='"+p.getNickname()+"' where id_Paciente = " + p.getIdPaciente());
		Conexao.fechar();
	}
}
