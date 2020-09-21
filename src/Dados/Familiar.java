package Dados;

import java.util.ArrayList;
import java.util.List;

public class Familiar {
	
	private int IdFamiliar;
	private String NomeFamiliar;
	private String Data_Nascimento;
	private String TelefoneFamiliar;
	private String EmailFamiliar;
	private String SenhaFamiliar;
	private List<Paciente> FamiliarDoente= new ArrayList<>();
	
	public int getIdFamiliar() {
		return IdFamiliar;
	}
	public void setIdFamiliar(int idFamiliar) {
		IdFamiliar = idFamiliar;
	}
	public String getNomeFamiliar() {
		return NomeFamiliar;
	}
	public void setNomeFamiliar(String nomeFamiliar) {
		NomeFamiliar = nomeFamiliar;
	}
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public String getTelefoneFamiliar() {
		return TelefoneFamiliar;
	}
	public void setTelefoneFamiliar(String telefoneFamiliar) {
		TelefoneFamiliar = telefoneFamiliar;
	}
	public String getEmailFamiliar() {
		return EmailFamiliar;
	}
	public void setEmailFamiliar(String emailFamiliar) {
		EmailFamiliar = emailFamiliar;
	}
	public String getSenhaFamiliar() {
		return SenhaFamiliar;
	}
	public void setSenhaFamiliar(String senhaFamiliar) {
		SenhaFamiliar = senhaFamiliar;
	}

	public List<Paciente> getFamiliarDoente() {
		return FamiliarDoente;
	}
	public void addFamiliarDoente(Paciente familiarDoente) {
		this.FamiliarDoente.add(familiarDoente);
	}
	
}
