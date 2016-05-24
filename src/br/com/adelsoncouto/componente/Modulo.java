package br.com.adelsoncouto.componente;

import java.util.ArrayList;
import java.util.List;

import br.com.adelsoncouto.angular.dois.GerarCss;
import br.com.adelsoncouto.angular.dois.GerarHtml;
import br.com.adelsoncouto.angular.dois.GerarTs;

public class Modulo {
	
	private String nome;
	private boolean producao = false;
	private String icone ="";
	private String descricao = "";
	private String label = "";
	private String url = "";
	private ClassPainel classPainel = new ClassPainel();
	private HttpFunction httpFunction = new HttpFunction(); 
	private List<Atributo> listAtributo = new ArrayList<>();
	private List<Injection> listInjection = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StringBuilder codigoTs() {
		GerarTs g = new GerarTs(this);
		return g.codigo();
	}
	public StringBuilder codigoHtml() {
		GerarHtml g = new GerarHtml(this);
		return g.codigo();
	}
	public StringBuilder codigoCss() {
		GerarCss g = new GerarCss(this);
		return g.codigo();
	}

	public boolean isProducao() {
		return producao;
	}

	public void setProducao(boolean producao) {
		this.producao = producao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Atributo> getListAtributo() {
		return listAtributo;
	}

	public void setListAtributo(List<Atributo> listAtributo) {
		this.listAtributo = listAtributo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public List<Injection> getListInjection() {
		return listInjection;
	}
	public void setListInjection(List<Injection> listInjection) {
		this.listInjection = listInjection;
	}

	public HttpFunction getHttpFunction() {
		return httpFunction;
	}

	public void setHttpFunction(HttpFunction httpFunction) {
		this.httpFunction = httpFunction;
	}

	public ClassPainel getClassPainel() {
		return classPainel;
	}

	public void setClassPainel(ClassPainel classPainel) {
		this.classPainel = classPainel;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
