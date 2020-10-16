package Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import Dados.Familiar;
import Dados.Paciente;
import Dados.Usuario;

public class Facade {

	public static boolean cadastrarPaciente(String nome, String email, String data, String nickname, String senha, String telefone) {
		Paciente p = new Paciente();
		p.setNomeUsuario(nome);
		p.setEmailUsuario(email);
		p.setData_Nascimento(data);
		p.setNickname(nickname);
		p.setSenhaUsuario(senha);
		p.setTelefoneUsuario(telefone);
		System.out.println(p.getNomeUsuario()+p.getEmailUsuario()+p.getNickname()+p.getNomeUsuario()+p.getData_Nascimento()+p.getTelefoneUsuario());
		return p.cadastrar(p);
		
	}
	
	public static boolean cadastrarFamiliar(String nome, String email, String data, String senha, String telefone) {
		Usuario p = new Familiar();
		p.setNomeUsuario(nome);
		p.setEmailUsuario(email);
		p.setData_Nascimento(data);
		p.setSenhaUsuario(senha);
		p.setTelefoneUsuario(telefone);
		System.out.println(p.getNomeUsuario()+p.getEmailUsuario()+p.getNomeUsuario()+p.getData_Nascimento()+p.getTelefoneUsuario());
		return p.cadastrar(p);
		
	}
	
	public static Paciente loginPaciente(String email, String senha){
		Usuario user = new Paciente();
		return (Paciente) user.login(email, senha);
	}
	
	public static Familiar loginFamiliar(String email, String senha){
		Usuario user = new Familiar();
		return (Familiar) user.login(email, senha);
	}
	
	public static int getPacienteByNickname(String nickname) throws SQLException{
		Paciente paciente = new Paciente();
		return paciente.getPacienteByNickname(nickname);
	}
	
	public static boolean AdicionarPacienteAFamiliar(int id_Familiar, int id_Paciente){
		Familiar familiar = new Familiar();
		return familiar.AdicionarPacienteAFamiliar(id_Familiar, id_Paciente);
	}
	
	public static ArrayList<Paciente> getPacientes() throws SQLException{
		Paciente paciente = new Paciente();
		return paciente.getPacientes();
	}
	
}
