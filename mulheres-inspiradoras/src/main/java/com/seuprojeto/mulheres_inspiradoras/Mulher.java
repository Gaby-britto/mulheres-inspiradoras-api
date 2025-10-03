package com.seuprojeto.mulheres_inspiradoras;

public class Mulher {
	private String nome;
	private String area;
	private String fraseInspiradora;
	
	
	public Mulher(String nome, String area, String fraseInspiradora) {
		super();
		this.nome = nome;
		this.area = area;
		this.fraseInspiradora = fraseInspiradora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFraseInspiradora() {
		return fraseInspiradora;
	}
	public void setFraseInspiradora(String fraseInspiradora) {
		this.fraseInspiradora = fraseInspiradora;
	}
}
