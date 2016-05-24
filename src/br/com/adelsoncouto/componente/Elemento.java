package br.com.adelsoncouto.componente;

public class Elemento {

	private String nome = "input";
	private String elementoClass = "form-control";
	private String colunaClass = "col-sm-12";
	private String mascara = "";
	private String tipo = "text";
	private Boolean criar = true;
	private Boolean editar = true;
	private Boolean deletar = true;
	private Boolean ler = true;
	private String click = "";
	private String keyup = "";
	private String keydown = "";
	private String change = "";
	
	public String getNome() {
		return nome;
	}
	public String getElementoClass() {
		return elementoClass;
	}
	public String getColunaClass() {
		return colunaClass;
	}
	public String getMascara() {
		return mascara;
	}
	public String getTipo() {
		return tipo;
	}
	public Boolean getCriar() {
		return criar;
	}
	public Boolean getEditar() {
		return editar;
	}
	public Boolean getDeletar() {
		return deletar;
	}
	public Boolean getLer() {
		return ler;
	}
	public String getClick() {
		return click;
	}
	public String getKeyup() {
		return keyup;
	}
	public String getKeydown() {
		return keydown;
	}
	public String getChange() {
		return change;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setElementoClass(String elementoClass) {
		this.elementoClass = elementoClass;
	}
	public void setColunaClass(String colunaClass) {
		this.colunaClass = colunaClass;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCriar(Boolean criar) {
		this.criar = criar;
	}
	public void setEditar(Boolean editar) {
		this.editar = editar;
	}
	public void setDeletar(Boolean deletar) {
		this.deletar = deletar;
	}
	public void setLer(Boolean ler) {
		this.ler = ler;
	}
	public void setClick(String click) {
		this.click = click;
	}
	public void setKeyup(String keyup) {
		this.keyup = keyup;
	}
	public void setKeydown(String keydown) {
		this.keydown = keydown;
	}
	public void setChange(String change) {
		this.change = change;
	}
	
}
