package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dados.Familiar;
import Dados.Mensagem;
import Dados.Paciente;
import Dados.Usuario;

public class Facade {

	public static boolean cadastrarPaciente(String nome, String email, String data, String nickname, String senha,
			String telefone) {
		Paciente p = new Paciente();
		p.setNomeUsuario(nome);
		p.setEmailUsuario(email);
		p.setData_Nascimento(data);
		p.setNickname(nickname);
		p.setSenhaUsuario(senha);
		p.setTelefoneUsuario(telefone);
		System.out.println(p.getNomeUsuario() + p.getEmailUsuario() + p.getNickname() + p.getNomeUsuario()
				+ p.getData_Nascimento() + p.getTelefoneUsuario());
		return p.cadastrar(p);
	}

	public static boolean cadastrarFamiliar(String nome, String email, String data, String senha, String telefone) {
		Usuario p = new Familiar();
		p.setNomeUsuario(nome);
		p.setEmailUsuario(email);
		p.setData_Nascimento(data);
		p.setSenhaUsuario(senha);
		p.setTelefoneUsuario(telefone);
		System.out.println(p.getNomeUsuario() + p.getEmailUsuario() + p.getNomeUsuario() + p.getData_Nascimento()
				+ p.getTelefoneUsuario());
		return p.cadastrar(p);
	}

	public static Paciente loginPaciente(String email, String senha) {
		Usuario user = new Paciente();
		return (Paciente) user.login(email, senha);
	}

	public static Familiar loginFamiliar(String email, String senha) {
		Usuario user = new Familiar();
		return (Familiar) user.login(email, senha);
	}

	public static int getPacienteByNickname(String nickname) throws SQLException {
		return Paciente.getPacienteByNickname(nickname);
	}

	public static boolean AdicionarPacienteAFamiliar(int id_Familiar, int id_Paciente) {
		Familiar familiar = new Familiar();
		return familiar.AdicionarPacienteAFamiliar(id_Familiar, id_Paciente);
	}

	public static ArrayList<Paciente> getPacientes() throws SQLException {
		Paciente paciente = new Paciente();
		return paciente.getPacientes();
	}

	public static boolean insertMensagem(String mensagem, int tipo, int id_Familiar, int id_Paciente) {
		Mensagem m = new Mensagem();
		m.setIdFamiliar(id_Familiar);
		m.setIdPaciente(id_Paciente);
		m.setMensagem(mensagem);
		m.setTipo(tipo);
		return m.insertMensagem(m);
	}

	public static List<Mensagem> getMensagens(int id_Paciente) throws SQLException {
		Mensagem m = new Mensagem();
		return m.getMensagens(id_Paciente);
	}

	public static boolean deletePaciente(int id_Paciente) {
		Paciente paciente = new Paciente();
		return paciente.deletePaciente(id_Paciente);
	}

	public static boolean deletefamiliar(int id_Familiar) {
		Familiar familiar = new Familiar();
		return familiar.deletefamiliar(id_Familiar);
	}

	public static boolean deleteMensagem(int id_Mensagem) {
		Mensagem mensagem = new Mensagem();
		return mensagem.deleteMensagem(id_Mensagem);
	}

	public static int getFamiliarByEmail(String email) throws SQLException {
		return Familiar.getIdFamiliarByEmail(email);
	}

	public static int getPacienteByEmail(String email) throws SQLException {
		return Paciente.getIdPacienteByEmail(email);
	}

}
