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
		request.setCharacterEncoding("utf-8");
		int id_Paciente = 0, id_Familiar, tipo;
		String mensagem = null, link="https://www.youtube.com/embed/", aux = "";
		id_Familiar = Integer.parseInt(request.getParameter("id_Familiar"));
		id_Paciente = Integer.parseInt(request.getParameter("id_Paciente"));
		mensagem = request.getParameter("mensagem");
		tipo = Integer.parseInt(request.getParameter("tipo"));
		if(tipo == 1){
			for(int i=0;i<mensagem.length()-1;i++){
				aux+=mensagem.charAt(i);
				if(mensagem.charAt(i+1) == '\n')
					aux += "<br>";
			}
			mensagem = aux;
		}
		if(tipo == 2){
			boolean cond = false;
			int contador = 0;
			for(int i=0;i<mensagem.length()-1;i++){
				if(mensagem.charAt(i) == '/')
					contador++;
				if(!cond && mensagem.charAt(i) == '=')
					cond = true;
				if(mensagem.charAt(i+1) == '&')
					break;
				if(cond){
					link += mensagem.charAt(i+1);
				}
			}
			contador = 0;
			if(!cond){
				for(int i=0;i<mensagem.length()-1;i++){
					if(mensagem.charAt(i) == '/')
						contador++;
					if(!cond && contador == 3)
						cond = true;
					if(cond){
						link += mensagem.charAt(i+1);
					}
				}
			}
			mensagem = link;
		}
		System.out.println(mensagem);
		Facade.insertMensagem(mensagem, tipo, id_Familiar, id_Paciente);
		
		
		response.sendRedirect("RedirecionarPerfilFamiliar");
	}

}
