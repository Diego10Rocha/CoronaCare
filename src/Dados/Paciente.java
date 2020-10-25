package Dados;

import java.sql.SQLException;
import java.util.ArrayList;

import Persistencia.PacienteDAO;

public class Paciente extends Usuario {

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
		return PacienteDAO.insertPaciente((Paciente) user);

	}

	public static int getPacienteByNickname(String nickname) throws SQLException {
		return PacienteDAO.getPacienteByNickname(nickname);
	}

	public ArrayList<Paciente> getPacientes() throws SQLException {
		return PacienteDAO.getPacientes();
	}

	public boolean deletePaciente(int id_Paciente) {
		return PacienteDAO.deletePaciente(id_Paciente);
	}

}