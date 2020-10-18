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

import Dados.Mensagem;

@WebServlet("/RedirecionarPerfilPaciente")
public class RedirecionarPerfilPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 HttpSession session=request.getSession();
	 if(session.getAttribute("emailPaciente") == null){
		response.sendRedirect("RedirecionarLoginPaciente");
	}else if(session.getAttribute("emailPaciente")!=null){
		int id_Paciente = (int) session.getAttribute("IdPaciente");
		List <Mensagem> messages = null;
		try {
			messages = Facade.getMensagens(id_Paciente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("ListaMensagens", messages);
		RequestDispatcher view = request.getRequestDispatcher("perfilPaciente.jsp");
		view.forward(request, response);
		
	}
	 
	}

}