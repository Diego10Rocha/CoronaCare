package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dados.Paciente;

@WebServlet("/LoginPaciente")
public class LoginPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email, senha;
		email = request.getParameter("email");
		senha = request.getParameter("password");
		System.out.println(email + senha);
		Paciente paciente = Facade.loginPaciente(email, senha);
		if(paciente != null){
			HttpSession session = request.getSession();
			
			session.setAttribute("IdPaciente", paciente.getIdUsuario());
			session.setAttribute("nomePaciente", paciente.getNomeUsuario());
			session.setAttribute("emailPaciente", paciente.getEmailUsuario());
			session.setMaxInactiveInterval(2000);
			response.sendRedirect("RedirecionarPerfilPaciente");
		}else
			response.sendRedirect("loginPaciente.jsp");
	}

}
