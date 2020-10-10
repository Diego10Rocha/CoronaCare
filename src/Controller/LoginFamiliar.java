package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dados.Familiar;
import Dados.Usuario;

@WebServlet("/LoginFamiliar")
public class LoginFamiliar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email, senha;
		email = request.getParameter("email");
		senha = request.getParameter("password");
		System.out.println(email + senha);
		Usuario user = new Familiar();
		Familiar paciente = (Familiar) user.login(email, senha);
		if(paciente != null)
			response.sendRedirect("perfilFamiliar.jsp");
		else
			response.sendRedirect("loginFamiliar.jsp");
	}

}
