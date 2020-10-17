package Dados;

import java.sql.SQLException;
import java.util.List;

import Persistencia.FamiliarDAO;

public class Familiar extends Usuario{

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
	
	public boolean AdicionarPacienteAFamiliar(int id_Familiar, int id_Paciente){
		return FamiliarDAO.insertPaciente_has_Familiar(id_Familiar, id_Paciente);
	}
	
}
