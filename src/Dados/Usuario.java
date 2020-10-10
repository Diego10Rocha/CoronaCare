package Dados;

public abstract class Usuario {
	private int IdUsuario;
	private String NomeUsuario;
	private String Data_Nascimento;
	private String TelefoneUsuario;
	private String emailUsuario;
	private String SenhaUsuario;
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public String getTelefoneUsuario() {
		return TelefoneUsuario;
	}
	public void setTelefoneUsuario(String telefoneUsuario) {
		TelefoneUsuario = telefoneUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getSenhaUsuario() {
		return SenhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		SenhaUsuario = senhaUsuario;
	}
	
	public abstract Usuario login(String email, String senha);
	
	public abstract boolean cadastrar(Usuario user);
}
