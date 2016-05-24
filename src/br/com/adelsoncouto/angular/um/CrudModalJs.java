package br.com.adelsoncouto.angular.um;

import br.com.adelsoncouto.componente.Injection;
import br.com.adelsoncouto.componente.Modulo;
import br.com.adelsoncouto.gerador.Util;

public class CrudModalJs {

	private Modulo modulo;
	private String nome;

	public CrudModalJs(Modulo aModulo) {
		this.modulo = aModulo;
		nome = Util.espacoToMaiuscula(
			Util.underlineToMaiuscula(
				Util.primeiraMinuscula(modulo.getNome())
			)
		);
	}

	public StringBuilder codigo() {
		
		String injection = injecion(modulo);
		String injectionSemAspa = injecionSemAspas(modulo);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(
				"﻿app.controller(\""+nome+"Controller\",\n" + 
				"	["+injection+"\n"+
				"		function("+injectionSemAspa+"){\n" + 
				"			$scope.tela = new Tela();\n" + 
				"			$scope.criar = new "+nome+"Controller_criar();\n" + 
				"			$scope.editar = new "+nome+"Controller_editar();\n" + 
				"			$scope.deletar = new "+nome+"Controller_deletar();\n" + 
				"		}\n" + 
				"	]\n" + 
				");\n\n");
		sb.append(criar());
		sb.append(deletar());
		sb.append(editar());
		
		return sb;
	}

	private Object editar() {
		String t = ""
				+ "function "+nome+"Controller_editar(){}\n\n";
		return t;
	}

	private Object deletar() {
		String t = ""
			+ "function "+nome+"Controller_deletar(){}\n\n";
		return t;
	}

	private Object criar() {
		String t = ""
			+ "function "+nome+"Controller_criar(){}\n\n";
		return t;
	}

	private String injecion(Modulo aModulo) {
		String t = "";
		for(Injection i:aModulo.getListInjection()){
			if(!t.equals("")){
				t += ", ";
			}
			t += "\""+i.getNome()+"\"";
		}
		
		if(!t.equals("")){
			t += ", ";
		}
		return t;
	}
	
	private String injecionSemAspas(Modulo aModulo) {
		String t = "";
		for(Injection i:aModulo.getListInjection()){
			if(!t.equals("")){
				t += ", ";
			}
			t += i.getNome();
		}
		return t;
	}
	
}
