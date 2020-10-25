package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RealizarCadastroFamiliar")
public class RealizarCadastroFamiliar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String nome, email, data, senha, telefone;
		nome = request.getParameter("nome");
		email = request.getParameter("emailUsuario");
		data = request.getParameter("datanascimento");
		senha = request.getParameter("senhaUsuario");
		telefone = request.getParameter("telefoneUsuario");
		int id=0;
		try {
			id = Facade.getFamiliarByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id);
		if(id!=0){
			request.setAttribute("erro", "email já cadastrado, tente novamente com outro email ou faça login");
			request.getRequestDispatcher("cadastroFamiliar.jsp").forward(request, response);
		}
		
		Facade.cadastrarFamiliar(nome, email, data, senha, telefone);
		
		response.sendRedirect("loginFamiliar.jsp");
		System.out.println("Familiar cadastrado com sucesso!");
	}

}
