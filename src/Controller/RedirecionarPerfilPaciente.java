package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RedirecionarPerfilPaciente")
public class RedirecionarPerfilPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 HttpSession session=request.getSession();
	 if(session.getAttribute("emailUsuario") == null){
		response.sendRedirect("RedirecionarLogin");
	}else if(session.getAttribute("emailUsuario")!=null){
		String login=(String) session.getAttribute("emailUsuario");
		int IdUsuario=(int) session.getAttribute("IdUsuario");
		
		RequestDispatcher view = request.getRequestDispatcher("TelaPerfil.jsp");
		view.forward(request, response);
		
	}
	 
	}

}