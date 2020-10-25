package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dados.Familiar;

@WebServlet("/LoginFamiliar")
public class LoginFamiliar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email, senha;
		email = request.getParameter("email");
		senha = request.getParameter("password");
		System.out.println(email + senha);
		Familiar familiar = Facade.loginFamiliar(email, senha);
		if (familiar != null) {
			HttpSession session = request.getSession();

			session.setAttribute("IdFamiliar", familiar.getIdUsuario());
			session.setAttribute("nomeFamiliar", familiar.getNomeUsuario());
			session.setAttribute("emailFamiliar", familiar.getEmailUsuario());
			session.setMaxInactiveInterval(2000);
			response.sendRedirect("RedirecionarPerfilFamiliar");
		} else
			response.sendRedirect("RedirecionarLoginFamiliar");
	}

}
