package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RealizarCadastroPaciente")
public class RealizarCadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String nome, email, data, nickname, senha, telefone;
		nome = request.getParameter("nome");
		email = request.getParameter("emailUsuario");
		data = request.getParameter("datanascimento");
		nickname = request.getParameter("nickname");
		senha = request.getParameter("senhaUsuario");
		telefone = request.getParameter("telefoneUsuario");
		int id = 0, id2 = 0;
		
		try {
			id = Facade.getFamiliarByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			id2 = Facade.getPacienteByNickname(nickname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(id != 0 && id2 != 0){
			request.setAttribute("erro", "email e nickname j� cadastrados, tente novamente com outro email e nickname ou fa�a login");
			request.getRequestDispatcher("cadastroPaciente.jsp").forward(request, response);
		}else if(id == 0 && id2 != 0){
			request.setAttribute("erro", "nickname j� cadastrado, tente novamente com outro nickname ou fa�a login");
			request.getRequestDispatcher("cadastroPaciente.jsp").forward(request, response);
		}else if(id != 0 && id2 == 0){
			request.setAttribute("erro", "email j� cadastrado, tente novamente com outro email ou fa�a login");
			request.getRequestDispatcher("cadastroPaciente.jsp").forward(request, response);
		}
		Facade.cadastrarPaciente(nome, email, data, nickname, senha, telefone);
		
		response.sendRedirect("loginPaciente.jsp");
		System.out.println("Paciente cadastrado com sucesso!");
	}

}
