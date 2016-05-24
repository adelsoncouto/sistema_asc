package br.com.adelsoncouto.componente;

import br.com.adelsoncouto.gerador.Padrao;

public class Sistema {
	private String nome;
	private String versao;
	private String versaoBug;
	private String versaoModulo;
	private String url;
	private String urlModulo;
	private String urlSql;
	private Padrao padrao;
	
	public Padrao getPadrao() {
		return padrao;
	}

	public void setPadrao(Padrao padrao) {
		this.padrao = padrao;
	}

	public Sistema(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getVersao() {
		return versao;
	}
	public String getVersaoBug() {
		return versaoBug;
	}
	public String getVersaoModulo() {
		return versaoModulo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public void setVersaoBug(String versaoBug) {
		this.versaoBug = versaoBug;
	}
	public void setVersaoModulo(String versaoModulo) {
		this.versaoModulo = versaoModulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlModulo() {
		return urlModulo;
	}

	public void setUrlModulo(String urlModulo) {
		this.urlModulo = urlModulo;
	}

	public String getUrlSql() {
		return urlSql;
	}

	public void setUrlSql(String urlSql) {
		this.urlSql = urlSql;
	}
	
	
	
}
