package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Dados.Familiar;
import Persistencia.FamiliarDAO;



@TestMethodOrder(OrderAnnotation.class)
class Dados_Familiar_Test {

	@Test
	@Order(1)
	void cadastrarTest() {
		Familiar f = new Familiar();
		f.setNomeUsuario("TESTE");
		f.setData_Nascimento("2020-02-01");
		f.setSenhaUsuario("123");
		f.setEmailUsuario("TESTE@teste.com");
		f.setTelefoneUsuario("122345678900");
		boolean expected = f.cadastrar(f);
		assertTrue(expected);
	}

	@Test
	@Order(2)
	void loginTeste() throws SQLException {
		boolean expected;
		Familiar paciente = FamiliarDAO.loginFamiliar("TESTE@teste.com", "123");
		if (paciente instanceof Familiar) {
			expected = true;
		}else {
			expected = false;
		}
		assertTrue(expected);
	}
	
	@Test
	@Order(3)
	void deletarTest() throws SQLException {
		int id = Familiar.getIdFamiliarByEmail("TESTE@teste.com");
		boolean expected = FamiliarDAO.deleteFamiliar(id);
		assertTrue(expected);
	}
}
