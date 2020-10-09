package Dados;

import java.util.ArrayList;
import java.util.List;

public class Familiar extends Usuario{
	
	private List<Paciente> FamiliarDoente= new ArrayList<>();

	public List<Paciente> getFamiliarDoente() {
		return FamiliarDoente;
	}
	public void addFamiliarDoente(Paciente familiarDoente) {
		this.FamiliarDoente.add(familiarDoente);
	}
	
	@Override
	public boolean login(String email, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void cadastrar(Usuario user) {
		// TODO Auto-generated method stub
		
	}
	
}
