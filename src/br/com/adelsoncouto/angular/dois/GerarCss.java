package br.com.adelsoncouto.angular.dois;

import br.com.adelsoncouto.componente.Modulo;

public class GerarCss {

	private Modulo modulo;

	public GerarCss(Modulo aModulo){
		this.modulo = aModulo;
	}
	
	public StringBuilder codigo(){
		StringBuilder codigo = new StringBuilder("css");
		return codigo;
	}
	
}
