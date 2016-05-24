package br.com.adelsoncouto.gerador;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args){
		try{
			GerarSistema gs = new GerarSistema(args[0]);
			System.out.println("Sistema gerado com sucesso");
		}catch(Exception e){
			System.out.println("Erro ao gerar o sistema: "+e.getMessage());
		}
		
		
		System.exit(0);
	}

}
