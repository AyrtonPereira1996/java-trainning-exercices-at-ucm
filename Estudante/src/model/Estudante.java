package model;

public class Estudante {
	private Long id;
	private String nomeEstudante;
	private String emailEstudante;
	private String endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEstudante() {
		return nomeEstudante;
	}
	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}
	public String getEmailEstudante() {
		return emailEstudante;
	}
	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
