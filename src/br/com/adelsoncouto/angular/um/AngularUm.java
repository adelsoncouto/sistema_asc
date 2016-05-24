package br.com.adelsoncouto.angular.um;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.regex.Pattern;

import br.com.adelsoncouto.componente.Injection;
import br.com.adelsoncouto.componente.Modulo;
import br.com.adelsoncouto.componente.Projeto;
import br.com.adelsoncouto.gerador.Util;

public class AngularUm {

	private Projeto projeto;

	public AngularUm(Projeto aProjeto) throws UnsupportedEncodingException, FileNotFoundException{
		this.projeto = aProjeto;
		this.init();
	}

	private void init() throws UnsupportedEncodingException, FileNotFoundException {
		String url = Pattern.compile("/*$").matcher(this.projeto.getSistema().getUrlModulo()).replaceAll("");
		
		for(Modulo m:this.projeto.getListModulo()){
			if(m.isProducao()){
				continue;
			}
			
			String urlm = url+"/"
				+Pattern.compile("/*$").matcher(m.getUrl()).replaceAll("");
			File f = new File(urlm);
			if(!f.exists()){
				f.mkdirs();
			}
			Calendar c = Calendar.getInstance();
			String cf = "_"+c.get(Calendar.DATE)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.YEAR)
				+"-"+c.get(Calendar.HOUR)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.SECOND);
			File controller = new File(urlm+"/controller.js");
			if(controller.exists()){
				controller.renameTo(new File(controller.getAbsolutePath()+cf));
			}
			Util.gravarArquivo(controller, this.js(m));
			
			File index = new File(urlm+"/index.html");
			if(index.exists()){
				index.renameTo(new File(index.getAbsolutePath()+cf));
			}
			Util.gravarArquivo(index, this.html(m));
		}
		
	}
	
	private StringBuilder html(Modulo aModulo){
		CrudModalHml cm = new CrudModalHml(aModulo);
		return cm.codigo();
	}
	
	private StringBuilder js(Modulo aModulo){
		CrudModalJs cm = new CrudModalJs(aModulo);
		return cm.codigo();
	}

	
}
