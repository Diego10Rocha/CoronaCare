package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EnviarMensagemTexto")
public class EnviarMensagemTexto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_Paciente = 0, id_Familiar, tipo;
		String mensagem = null;
		id_Familiar = Integer.parseInt(request.getParameter("id_Familiar"));
		id_Paciente = Integer.parseInt(request.getParameter("id_Paciente"));
		mensagem = request.getParameter("mensagem");
		tipo = Integer.parseInt(request.getParameter("tipo"));
		Facade.insertMensagem(mensagem, tipo, id_Familiar, id_Paciente);
		mensagem = request.getParameter("mensagem");
		
		
		response.sendRedirect("RedirecionarPerfilFamiliar");
	}

}
