package br.com.adelsoncouto.gerador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Util {
	
	public static String primeiraMinuscula(String aString){
		return aString.substring(0,1).toLowerCase()+aString.substring(1);
	}
	
	public static String primeiraMaiuscula(String aString){
		return aString.substring(0,1).toUpperCase()+aString.substring(1);
	}
	
	public static String maiusculaToUnderline(String aString){
		String s = "";
		for(char c:aString.toCharArray()){
			String l = String.valueOf(c).toUpperCase();
			if(s.length()>0 && l.equals(String.valueOf(c))){
				s += "_"+l.toLowerCase();
			}else{
				s += String.valueOf(c).toLowerCase();
			}
		}
		return s;
	}

	public static String underlineToMaiuscula(String aString){
		String s = "";
		boolean und = false;
		for(char c:aString.toCharArray()){
			
			if(String.valueOf(c).equals("_")){
				und = true;
			}else{
				if(und){
					s += String.valueOf(c).toUpperCase();
					und = false;
				}else{
					s += String.valueOf(c);
				}
			}
		}
		return s;
	}
	
	public static String maiusculaToEspaco(String aString){
		String s = "";
		for(char c:aString.toCharArray()){
			String l = String.valueOf(c).toUpperCase();
			if(s.length()>0){ 
				if(l.equals(String.valueOf(c))){
					s += " ";
				}
				s += c;
			}else{
				s += String.valueOf(c).toUpperCase();
			}
		}
		return s;
	}
	
	public static String espacoToMaiuscula(String aString){
		String s = "";
		boolean und = false;
		for(char c:aString.toCharArray()){
			
			if(String.valueOf(c).equals(" ")){
				und = true;
			}else{
				if(und){
					und = false;
					s += String.valueOf(c).toUpperCase();
				}else{
					s += String.valueOf(c);
				}
			}
		}
		return s;
	}
	
	public static void gravarArquivo(File aFile, StringBuilder aConteudo) throws UnsupportedEncodingException, FileNotFoundException{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream (aFile), "UTF-8"));				
		pw.write(aConteudo.toString());
		pw.close();
	}
	
}