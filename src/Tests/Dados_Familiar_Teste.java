package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Dados.Familiar;
import Dados.Paciente;
import Persistencia.FamiliarDAO;
import Persistencia.PacienteDAO;

class Dados_Familiar_Test {

	@Test
	void cadastrarTest() {
		Familiar f = new Familiar();
		f.setNomeUsuario("Teste");
		f.setData_Nascimento("2020-02-01");
		f.setSenhaUsuario("12322");
		f.setEmailUsuario("teste@teste.com");
		f.setTelefoneUsuario("122345678900");
		boolean expected = f.cadastrar(f);
		assertTrue(expected);
	}

	@Test
	void loginTeste() throws SQLException {
		boolean expected;
		Familiar paciente = FamiliarDAO.loginFamiliar("teste@teste.com", "122345678900");
		if (paciente instanceof Familiar) {
			expected = true;
		}else {
			expected = false;
		}
		assertTrue(expected);
	}
	
	@Test
	void deletarTest() throws SQLException {
		int id = Familiar.getIdFamiliarByUserName("Teste");
		boolean expected = FamiliarDAO.deleteFamiliar(id);
		assertTrue(expected);
	}
}
