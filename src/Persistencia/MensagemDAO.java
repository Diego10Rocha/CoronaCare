package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Dados.Mensagem;

public class MensagemDAO {
	
	public static List<Mensagem> getMensagem(int id_Familiar, int id_Paciente) throws SQLException {
		Mensagem m = null;
		List <Mensagem> message = new ArrayList<>();
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from Mensagem where id_Familiar = ? and id_Paciente = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, id_Familiar);
		stmt.setInt(2, id_Paciente);
		
		rs = stmt.executeQuery();
		try {
			rs.next();
			m = new Mensagem();
			m.setIdMensagem(rs.getInt("id_Mensagem"));
			m.setIdPaciente(rs.getInt("id_Paciente"));
			m.setIdFamiliar(rs.getInt("id_Familiar"));
			m.setMensagem(rs.getString("mensagem"));
			m.setTipo(rs.getInt("tipo"));
			message.add(m);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		con.close();
		stmt.close();
		rs.close();
		
		return message;
	}
	
	public static List<Mensagem> getMensagens(int id_Paciente) throws SQLException {
		Mensagem m = null;
		List <Mensagem> message = new ArrayList<>();
		ResultSet rs;
		PreparedStatement stmt;
		
		String sql = "select * from vMensagemPaciente where id_Paciente = ?";
		Connection con = Conexao.getConnection();
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, id_Paciente);
		
		rs = stmt.executeQuery();
		try {
			rs.next();
			m = new Mensagem();
			m.setIdMensagem(rs.getInt("id_Mensagem"));
			m.setIdPaciente(rs.getInt("id_Paciente"));
			m.setIdFamiliar(rs.getInt("id_Familiar"));
			m.setMensagem(rs.getString("mensagem"));
			m.setTipo(rs.getInt("tipo"));
			message.add(m);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		con.close();
		stmt.close();
		rs.close();
		
		return message;
	}
	
	public static boolean deleteMensagem(int Id) {
		PreparedStatement stmt;
		Connection con;
		String sql = "delete from Mensagem where id_Mensagem = ?";
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
	
	public static boolean insertMensagem(Mensagem m) {
		PreparedStatement stmt;
		Connection con;
		String sql = "insert into Mensagem(mensagem, tipo, id_Familiar, id_Paciente)"
				+ "values (?,?,?,?)";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, m.getMensagem());
			stmt.setInt(2, m.getTipo());
			stmt.setInt(3, m.get_IdFamiliar());
			stmt.setInt(4, m.getIdPaciente());
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
	
	public static boolean updateFamiliar(Mensagem m) {
		PreparedStatement stmt;
		Connection con;
		String sql = "update Mensagem set mensagem = ?, tipo = ? where id_Mensagem = ?";
		try {
			con = Conexao.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, m.getMensagem());
			stmt.setInt(2, m.getTipo());
			stmt.setInt(3, m.getIdMensagem());
			stmt.executeUpdate();
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
