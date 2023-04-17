package edu.fatec.exercicio1;

public abstract class Mensagem {

	private Contatinho destinatario;
	private String horaEnvio;
	private String conteudo;
	
	public String toString() {
		return "";
	}
	
	public abstract Mensagem sendMessage(String message);

	public Contatinho getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Contatinho destinatario) {
		this.destinatario = destinatario;
	}

	public String getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
