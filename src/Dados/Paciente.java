package Dados;

import java.sql.SQLException;

import Persistencia.PacienteDAO;

public class Paciente extends Usuario{
	
	private String Nickname;
	
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	
	@Override
	public Usuario login(String email, String senha) {
		try {
			return PacienteDAO.loginPaciente(email, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean cadastrar(Usuario user) {
		Paciente p = (Paciente) user;
		p.setNickname(this.Nickname);
		return PacienteDAO.insertPaciente(p);
		
	}
	

}