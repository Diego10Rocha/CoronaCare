package Dados;

public class Paciente {
	
	private int IdPaciente;
	private String NomePaciente;
	private String Data_Nascimento;
	private String TelefonePaciente;
	private String emailPaciente;
	private String SenhaPaciente;
	private String Nickname;
	
	public int getIdPaciente() {
		return IdPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		IdPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return NomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		NomePaciente = nomePaciente;
	}
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public String getTelefonePaciente() {
		return TelefonePaciente;
	}
	public void setTelefonePaciente(String telefonePaciente) {
		TelefonePaciente = telefonePaciente;
	}
	public String getEmailPaciente() {
		return emailPaciente;
	}
	public void setEmailPaciente(String email) {
		this.emailPaciente = email;
	}
	public String getSenhaPaciente() {
		return SenhaPaciente;
	}
	public void setSenhaPaciente(String senha) {
		SenhaPaciente = senha;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	

}