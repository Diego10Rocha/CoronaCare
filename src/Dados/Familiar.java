package Dados;

import java.sql.SQLException;
import java.util.List;

import Persistencia.FamiliarDAO;

public class Familiar extends Usuario {

	public List<Paciente> getFamiliarDoente(int id_Familiar) throws SQLException {
		return FamiliarDAO.getPacientes(id_Familiar);
	}

	@Override
	public Usuario login(String email, String senha) {
		try {
			return FamiliarDAO.loginFamiliar(email, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean cadastrar(Usuario user) {
		return FamiliarDAO.insertFamiliar(user);
	}

	public boolean AdicionarPacienteAFamiliar(int id_Familiar, int id_Paciente) {
		return FamiliarDAO.insertPaciente_has_Familiar(id_Familiar, id_Paciente);
	}

	public boolean deletefamiliar(int id_Familiar) {
		return FamiliarDAO.deleteFamiliar(id_Familiar);
	}

	public static int getIdFamiliarByEmail(String email) {
		try {
			return FamiliarDAO.getFamiliarByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
