package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexao.Conexao;
import Dados.Familiar;
import Dados.Paciente;
import Dados.Usuario;

public class FamiliarDAO {
	
	public static Familiar getFamiliar(int Id) throws SQLException {
		Familiar f = null;
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from Paciente where id_Familiar = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, Id);
		
		rs = stmt.executeQuery();
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
		
		con.close();
		stmt.close();
		rs.close();
		
		return f;
	}
	
	public static ArrayList <Paciente> getPacientes(int Id) throws SQLException{
		ArrayList <Paciente> pacientes = new ArrayList<Paciente> ();
		Paciente p = null;
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from vPacientesFamiliar where id_Familiar = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, Id);
		
		rs = stmt.executeQuery();
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
		
		rs.close();
		con.close();
		stmt.close();
		
		return pacientes;
	}
	
	public static Familiar loginFamiliar(String email, String password) throws SQLException {
		Familiar f = null;
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from Familiar where emailFamiliar = ? and senhaFamiliar = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2, password);
		
		rs = stmt.executeQuery();
		try {
			rs.next();
			f = new Familiar();
			f.setIdUsuario(rs.getInt("id_Familiar"));
			f.setNomeUsuario(rs.getString("nomeFamiliar"));
			f.setData_Nascimento(rs.getString("dataNascFamiliar"));
			f.setTelefoneUsuario(rs.getString("telefoneFamiliar"));
			f.setSenhaUsuario(rs.getString("senhaFamiliar"));
			f.setEmailUsuario(rs.getString("emailFamiliar"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			f = null;
		}
		
		con.close();
		stmt.close();
		rs.close();
		
		return f != null ? f : null;
	}
	
	public static boolean deleteFamiliar(int Id) {
		PreparedStatement stmt;
		Connection con;
		String sql = "delete from Paciente where id_Familiar = ?";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,  Id);
			stmt.executeUpdate();
			con.close();
			stmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean insertFamiliar(Usuario f) {
		PreparedStatement stmt;
		Connection con;
		String sql = "insert into Familiar(nomeFamiliar, emailFamiliar, senhaFamiliar, dataNascFamiliar, telefoneFamiliar)"
				+ "values (?,?,?,?,?)";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,  f.getNomeUsuario());
			stmt.setString(2, f.getEmailUsuario());
			stmt.setString(3, f.getSenhaUsuario());
			stmt.setString(4, f.getData_Nascimento());
			stmt.setString(5, f.getTelefoneUsuario());
			stmt.executeUpdate();
			con.close();
			stmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean updateFamiliar(Familiar f) {
		PreparedStatement stmt;
		Connection con;
		String sql = "update Familiar set nomeFamiliar = ?, emailFamiliar = ?, dataNascPaciente = ?, telefoneFamiliar = ?, "
				+ "senhaFamiliar = ? where id_Familiar = ?";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,  f.getNomeUsuario());
			stmt.setString(2, f.getEmailUsuario());
			stmt.setString(3, f.getSenhaUsuario());
			stmt.setString(4, f.getData_Nascimento());
			stmt.setString(5, f.getTelefoneUsuario());
			stmt.executeUpdate();
			con.close();
			stmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean insertPaciente_has_Familiar(int id_Familiar, int id_Paciente){
		PreparedStatement stmt;
		Connection con;
		String sql = "insert into Paciente_has_Familiar(id_Paciente, id_Familiar)"
				+ "values (?,?)";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,  id_Paciente);
			stmt.setInt(2, id_Familiar);
			stmt.executeUpdate();
			con.close();
			stmt.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
