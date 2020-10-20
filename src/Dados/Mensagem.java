package Dados;

import java.sql.SQLException;
import java.util.List;

import Persistencia.MensagemDAO;

public class Mensagem {
	private int IdPaciente;
	private int IdFamiliar;
	private int IdMensagem;
	private String Mensagem;
	private int tipo;
	private String nomeFamiliar;
	
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
	public String getNomeFamiliar() {
		return nomeFamiliar;
	}
	public void setNomeFamiliar(String nomeFamiliar) {
		this.nomeFamiliar = nomeFamiliar;
	}
	
	public boolean insertMensagem(Mensagem message){
		return MensagemDAO.insertMensagem(message);
	}
	
	public List <Mensagem> getMensagens(int id_Paciente) throws SQLException{
		return MensagemDAO.getMensagens(id_Paciente);
	}
	
	public boolean deleteMensagem(int id_Mensagem){
		return MensagemDAO.deleteMensagem(id_Mensagem);
	}

}
