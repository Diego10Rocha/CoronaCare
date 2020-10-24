package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dados.Familiar;
import Dados.Paciente;

@WebServlet("/RedirecionarPerfilFamiliar")
public class RedirecionarPerfilFamiliar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (session.getAttribute("emailFamiliar") == null) {
			response.sendRedirect("RedirecionarLoginFamiliar");
		} else if (session.getAttribute("emailFamiliar") != null) {

			Familiar familiar = new Familiar();
			int id_Familiar = (int) session.getAttribute("IdFamiliar");
			List<Paciente> familiares = null;
			try {
				familiares = familiar.getFamiliarDoente(id_Familiar);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			request.setAttribute("ListaFamiliarDoente", familiares);

			List<Paciente> pacientes = null;
			try {
				pacientes = Facade.getPacientes();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("ListaPacientes", pacientes);

			RequestDispatcher view = request.getRequestDispatcher("perfilFamiliar.jsp");
			view.forward(request, response);

		}

	}

}