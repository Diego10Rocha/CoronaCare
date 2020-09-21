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
			f.setIdFamiliar(rs.getInt("id_Familiar"));
			f.setNomeFamiliar(rs.getString("nomeFamiliar"));
			f.setData_Nascimento(rs.getString("dataNascFamiliar"));
			f.setTelefoneFamiliar(rs.getString("telefoneFamiliar"));
			f.setTelefoneFamiliar(rs.getString("senhaFamiliar"));
			f.setTelefoneFamiliar(rs.getString("emailFamiliar"));
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
		
		rs = Conexao.receberDados("select * from vPacientesFamiliar");
		try {
			while(rs.next()) {
				p = new Paciente();
				p.setIdPaciente(rs.getInt("id_Paciente"));
				p.setNomePaciente(rs.getString("nomePaciente"));
				p.setData_Nascimento(rs.getString("dataNascPaciente"));
				p.setTelefonePaciente(rs.getString("telefonePaciente"));
				p.setTelefonePaciente(rs.getString("senhaPaciente"));
				p.setTelefonePaciente(rs.getString("emailPaciente"));
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
			f.setIdFamiliar(rs.getInt("id_Familiar"));
			f.setNomeFamiliar(rs.getString("nomeFamiliar"));
			f.setData_Nascimento(rs.getString("dataNascFamiliar"));
			f.setTelefoneFamiliar(rs.getString("telefoneFamiliar"));
			f.setTelefoneFamiliar(rs.getString("senhaFamiliar"));
			f.setTelefoneFamiliar(rs.getString("emailFamiliar"));
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
				+ "values ('" + f.getNomeFamiliar() + "','" + f.getEmailFamiliar()+ "', '" + f.getSenhaFamiliar() 
				+"', '" + f.getData_Nascimento() +"', '" + f.getTelefoneFamiliar()+"')");
		Conexao.fechar();
	}
	
	public static void updateFamiliar(Familiar f) {
		Conexao.conectar();
		Conexao.enviarDados("update Familiar set nomeFamiliar = '" + f.getNomeFamiliar() + "', emailFamiliar ='" + f.getEmailFamiliar() 
		+ "', dataNascPaciente ='" + f.getData_Nascimento() + "', telefoneFamiliar ='" + f.getTelefoneFamiliar() + "', senhaFamiliar ='" 
				+ f.getSenhaFamiliar() + "' where id_Familiar = " + f.getIdFamiliar());
		Conexao.fechar();
	}

}
