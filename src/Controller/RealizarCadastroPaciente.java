package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RealizarCadastroPaciente")
public class RealizarCadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String nome, email, data, nickname, senha, telefone;
		nome = request.getParameter("nome");
		email = request.getParameter("emailUsuario");
		data = request.getParameter("datanascimento");
		nickname = request.getParameter("nickname");
		senha = request.getParameter("senhaUsuario");
		telefone = request.getParameter("telefoneUsuario");

		Facade.cadastrarPaciente(nome, email, data, nickname, senha, telefone);

		response.sendRedirect("loginPaciente.jsp");
		System.out.println("Paciente cadastrado com sucesso!");
	}

}
