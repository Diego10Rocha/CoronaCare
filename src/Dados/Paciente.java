package Dados;

public class Paciente extends Usuario{
	
	private String Nickname;
	
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
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