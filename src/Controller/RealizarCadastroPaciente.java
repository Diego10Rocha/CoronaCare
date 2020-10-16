package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dados.Paciente;


@WebServlet("/RealizarCadastroPaciente")
public class RealizarCadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Paciente p = new Paciente();
		p.setNomeUsuario(request.getParameter("nome"));
		p.setEmailUsuario(request.getParameter("emailUsuario"));
		p.setData_Nascimento(request.getParameter("datanascimento"));
		p.setNickname(request.getParameter("nickname"));
		p.setSenhaUsuario(request.getParameter("senhaUsuario"));
		p.setTelefoneUsuario(request.getParameter("telefoneUsuario"));
		System.out.println(p.getNomeUsuario()+p.getEmailUsuario()+p.getNickname()+p.getNomeUsuario()+p.getData_Nascimento()+p.getTelefoneUsuario());
		p.cadastrar(p);
		response.sendRedirect("loginPaciente.jsp");
		System.out.println("Paciente cadastrado com sucesso!");
	}

}
