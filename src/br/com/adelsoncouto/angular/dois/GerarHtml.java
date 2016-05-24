package br.com.adelsoncouto.angular.dois;

import br.com.adelsoncouto.componente.Modulo;

public class GerarHtml {


	private Modulo modulo;

	public GerarHtml(Modulo aModulo){
		this.modulo = aModulo;
	}
	
	public StringBuilder codigo(){
		StringBuilder codigo = new StringBuilder("html");
		return codigo;
	}
	

}
