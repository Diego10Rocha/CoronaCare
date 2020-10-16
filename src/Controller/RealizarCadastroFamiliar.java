package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dados.Familiar;
import Dados.Usuario;

@WebServlet("/RealizarCadastroFamiliar")
public class RealizarCadastroFamiliar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Usuario p = new Familiar();
		p.setNomeUsuario(request.getParameter("nome"));
		p.setEmailUsuario(request.getParameter("emailUsuario"));
		p.setData_Nascimento(request.getParameter("datanascimento"));
		p.setSenhaUsuario(request.getParameter("senhaUsuario"));
		p.setTelefoneUsuario(request.getParameter("telefone"));
		System.out.println(p.getNomeUsuario()+p.getEmailUsuario()+p.getNomeUsuario()+p.getData_Nascimento()+p.getTelefoneUsuario());
		p.cadastrar(p);
		response.sendRedirect("loginFamiliar.jsp");
		System.out.println("Familiar cadastrado com sucesso!");
	}

}
