package Dados;

import Persistencia.MensagemDAO;

public class Mensagem {
	private int IdPaciente;
	private int IdFamiliar;
	private int IdMensagem;
	private String Mensagem;
	private int tipo;
	
	public int getIdPaciente() {
		return IdPaciente;
	}
	public void setIdPaciente(int IdPaciente) {
		this.IdPaciente = IdPaciente;
	}
	public int get_IdFamiliar() {
		return IdFamiliar;
	}
	public void setIdFamiliar(int IdFamiliar) {
		this.IdFamiliar = IdFamiliar;
	}
	public int getIdMensagem() {
		return IdMensagem;
	}
	public void setIdMensagem(int IdMensagem) {
		this.IdMensagem = IdMensagem;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean insertMensagem(Mensagem message){
		return MensagemDAO.insertMensagem(message);
	}
}
