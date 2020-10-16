package Controller;

import Dados.Paciente;
import Dados.Usuario;
import Persistencia.PacienteDAO;

public class Facade {

	public boolean cadastrarPaciente(Usuario user) {
		Paciente p = (Paciente) user;
		return PacienteDAO.insertPaciente(p);
		
	}
}
