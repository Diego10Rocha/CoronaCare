package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Dados.Paciente;
import Persistencia.PacienteDAO;


@TestMethodOrder(OrderAnnotation.class)
class Dados_Paciente_Test {


	@Test
	@Order(1)
	void cadastrarTest() {
		Paciente p = new Paciente();
		p.setNomeUsuario("Teste");
		p.setNickname("TESTE");
		p.setNomeUsuario("teste");
		p.setData_Nascimento("2020-02-01");
		p.setSenhaUsuario("123");
		p.setEmailUsuario("Teste@teste.com");
		p.setTelefoneUsuario("122345678900");
		boolean expected = p.cadastrar(p);
		assertTrue(expected);
	}
	
	@Test
	@Order(2)
	void loginTeste() throws SQLException {
		boolean expected;
		Paciente paciente = PacienteDAO.loginPaciente("Teste@teste.com", "123");
		if (paciente instanceof Paciente) {
			expected = true;
		}else {
			expected = false;
		}
		assertTrue(expected);
	}

	@Test
	@Order(3)
	void deletarTest() throws SQLException {
		int id = Paciente.getPacienteByNickname("TESTE");
		boolean expected = PacienteDAO.deletePaciente(id);
		assertTrue(expected);
	}
	
}
