package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;
import Dados.Paciente;

public class PacienteDAO {
	
	public static Paciente getPaciente(int Id) throws SQLException {
		Paciente p = null;
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from Paciente where id_Paciente = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, Id);
		
		
		rs = stmt.executeQuery();
		try {
			rs.next();
			p = new Paciente();
			p.setIdUsuario(rs.getInt("id_Paciente"));
			p.setNomeUsuario(rs.getString("nomePaciente"));
			p.setData_Nascimento(rs.getString("dataNascPaciente"));
			p.setTelefoneUsuario(rs.getString("telefonePaciente"));
			p.setTelefoneUsuario(rs.getString("senhaPaciente"));
			p.setTelefoneUsuario(rs.getString("emailPaciente"));
			p.setNickname(rs.getString("nickname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rs.close();
		stmt.close();
		con.close();
		
		return p;
	}
	
	public static Paciente loginPaciente(String email, String password) throws SQLException {
		Paciente p = null;
		ResultSet rs;
		PreparedStatement stmt;
		Connection con = Conexao.getConnection();
		
		String sql = "select * from Paciente where emailPaciente = ? and senhaPaciente = ?";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2, password);
		rs = stmt.executeQuery();
		
		try {
			rs.next();
			p = new Paciente();
			p.setIdUsuario(rs.getInt("id_Paciente"));
			p.setNomeUsuario(rs.getString("nomePaciente"));
			p.setData_Nascimento(rs.getString("dataNascPaciente"));
			p.setTelefoneUsuario(rs.getString("telefonePaciente"));
			p.setTelefoneUsuario(rs.getString("senhaPaciente"));
			p.setTelefoneUsuario(rs.getString("emailPaciente"));
			p.setNickname(rs.getString("nickname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			p = null;
		}
		
		con.close();
		rs.close();
		stmt.close();
		
		return p != null ? p : null;
	}
	
	public static boolean deletePaciente(int Id){
		PreparedStatement stmt;
		Connection con;
		String sql = "delete from Paciente where id_Paciente = ?";
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
	
	public static boolean insertPaciente(Paciente p){
		PreparedStatement stmt;
		Connection con;
		String sql = "insert into Paciente(nomePaciente, nickname, emailPaciente, senhaPaciente, dataNascPaciente, telefonePaciente)"
				+ "values (?,?,?,?,?,?)";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,  p.getNomeUsuario());
			stmt.setString(2, p.getNickname());
			stmt.setString(3, p.getEmailUsuario());
			stmt.setString(4, p.getSenhaUsuario());
			stmt.setString(5, p.getData_Nascimento());
			stmt.setString(6, p.getTelefoneUsuario());
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
	
	public static boolean updatePaciente(Paciente p) throws SQLException {
		PreparedStatement stmt;
		Connection con;
		String sql = "update Paciente set nomePaciente = ?, emailPaciente = ?, dataNascPaciente = ?, telefonePaciente = ?, senhaPaciente = ?" 
		+ ",nickname = ? where id_Paciente = ?";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1,  p.getNomeUsuario());
			stmt.setString(2, p.getNickname());
			stmt.setString(3, p.getEmailUsuario());
			stmt.setString(4, p.getSenhaUsuario());
			stmt.setString(5, p.getData_Nascimento());
			stmt.setString(6, p.getTelefoneUsuario());
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
