package br.com.adelsoncouto.angular.dois;

import javax.swing.plaf.synth.SynthScrollBarUI;

import br.com.adelsoncouto.componente.Atributo;
import br.com.adelsoncouto.componente.Modulo;
import br.com.adelsoncouto.gerador.Util;

public class GerarTs {

	private Modulo modulo;

	public GerarTs(Modulo aModulo){
		this.modulo = aModulo;
	}

	public StringBuilder codigo() {
		String underline = Util.maiusculaToUnderline(this.modulo.getNome());
		String pmaiuscula = Util.primeiraMaiuscula(Util.underlineToMaiuscula(this.modulo.getNome()));
		StringBuilder codigo = new StringBuilder(
				"import { Component, ViewEncapsulation } from '@angular/core';\n" + 
				"\n" + 
				"@Component({\n" + 
				"	moduleId: module.id,\n" + 
				"	selector: 'modulo-"+underline+"',\n" + 
				"	templateUrl: '"+underline+".component.html',\n" + 
				"	styleUrls: [\n" + 
				"		'"+underline+".component.css'\n" + 
				"	],\n" + 
				"	encapsulation: ViewEncapsulation.None\n" + 
				"})\n" + 
				"export class "+pmaiuscula+"Component {\n" + 
				this.gerarAtributoPrivado() + 
				"\n" + 
				"	public exibirTela():void{\n" + 
				"		this.tela = !this.tela;\n" + 
				"	}\n" + 
				"}"
				);
		return codigo;
	}
	
	private String gerarAtributoPrivado(){
		String t = "";
		for(Atributo a:this.modulo.getListAtributo()){
			t += "	private _"+Util.underlineToMaiuscula(a.getNome())+": "+this.parserTipo(a)+";\n";
		}
		return t;
	}
	
	private String parserTipo(Atributo aAtributo){
		switch(aAtributo.getTipo()){
			case INT:{
				return "number = "+aAtributo.getValorPadrao();
			}
			case DOUBLE:{
				return "number = "+aAtributo.getValorPadrao();
			}
			case FLOAT:{
				return "number = "+aAtributo.getValorPadrao();
			}
			case TEXT:{
				return "string = '"+aAtributo.getValorPadrao()+"'";
			}
			case VARCHAR:{
				return "string = '"+aAtributo.getValorPadrao()+"'";
			}
			default:{
				return "any"; 
			}
		}
	}
}
