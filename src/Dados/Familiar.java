package Dados;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Persistencia.FamiliarDAO;

public class Familiar extends Usuario{
	
	private List<Paciente> FamiliarDoente= new ArrayList<>();

	public List<Paciente> getFamiliarDoente() {
		return FamiliarDoente;
	}
	public void addFamiliarDoente(Paciente familiarDoente) {
		this.FamiliarDoente.add(familiarDoente);
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
	
}
