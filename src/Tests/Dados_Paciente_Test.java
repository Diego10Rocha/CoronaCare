package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Dados.Paciente;
import Persistencia.PacienteDAO;

class Dados_Paciente_Test {


	
	@Test
	void cadastrarTest() {
		Paciente p = new Paciente();
		p.setNomeUsuario("teste");
		p.setNickname("TESTE");
		p.setNomeUsuario("Teste");
		p.setData_Nascimento("2020-02-01");
		p.setSenhaUsuario("12322");
		p.setEmailUsuario("teste@teste.com");
		p.setTelefoneUsuario("122345678900");
		boolean expected = p.cadastrar(p);
		assertTrue(expected);
	}
	
	@Test
	void loginTeste() throws SQLException {
		boolean expected;
		Paciente paciente = PacienteDAO.loginPaciente("teste@teste.com", "122345678900");
		if (paciente instanceof Paciente) {
			expected = true;
		}else {
			expected = false;
		}
		assertTrue(expected);
	}

	@Test
	void deletarTest() throws SQLException {
		int id = Paciente.getPacienteByNickname("TESTE");
		boolean expected = PacienteDAO.deletePaciente(id);
		assertTrue(expected);
	}
}
