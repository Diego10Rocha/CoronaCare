package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ControleLogout")
public class ControleLogoutPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("emailPaciente");
		session.removeAttribute("nomePaciente");
		session.removeAttribute("idPaciente");;
		session.invalidate();
		response.sendRedirect("RedirecionarLoginPaciente");
	}

}
