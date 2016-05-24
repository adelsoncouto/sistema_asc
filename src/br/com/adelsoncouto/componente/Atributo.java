package br.com.adelsoncouto.componente;

import br.com.adelsoncouto.gerador.Tipo;

public class Atributo {
	private String nome = "";
	private Integer tamanho = 10;
	private String label ="";
	private boolean pk = false;
	private String fk = "";
	private Elemento elemento = new Elemento();
	private Tipo tipo = Tipo.VARCHAR;
	private String valorPadrao = "";
	
	public String getNome() {
		return nome;
	}
	public Integer getTamanho() {
		return tamanho;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getValorPadrao() {
		return valorPadrao;
	}
	public void setValorPadrao(String valorPadrao) {
		this.valorPadrao = valorPadrao;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isPk() {
		return pk;
	}
	public void setPk(boolean pk) {
		this.pk = pk;
	}
	public String getFk() {
		return fk;
	}
	public void setFk(String fk) {
		this.fk = fk;
	}
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	
}
