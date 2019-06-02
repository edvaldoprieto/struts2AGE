package br.com.testeage.action;

public class Exame {
	
	private Integer idExame;
	private String nomeExame;
	
	
	public Exame(Integer idExame, String nomeExame) {
		
		this.idExame = idExame;
		this.nomeExame = nomeExame;
		
	}

//	public Exame() {
//		// TODO Auto-generated constructor stub
//	}

	public Integer getIdExame() {
		return idExame;
	}

	public void setIdExame(Integer idExame) {
		this.idExame = idExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}


}