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
	
}
