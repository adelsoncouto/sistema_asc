package br.com.adelsoncouto.gerador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.adelsoncouto.angular.dois.AngularDois;
import br.com.adelsoncouto.angular.um.AngularUm;
import br.com.adelsoncouto.componente.Projeto;
import br.com.adelsoncouto.tradicional.Tradicional;

public class GerarSistema {
	
	

	public GerarSistema(String aCaminhoArquivoJson) throws UnsupportedEncodingException, IOException{
		String path = Pattern.compile("/+$").matcher(aCaminhoArquivoJson).replaceAll("");
		try(Reader reader = new InputStreamReader(new FileInputStream(new File(path+"/sistema_asc.json")), "UTF-8")){
			Gson gson = new GsonBuilder().create();
			Projeto p = gson.fromJson(reader, Projeto.class);
			
			switch(p.getSistema().getPadrao()){
			
				case ANGULAR_1:{
					new AngularUm(p);
					break;
				}
				case ANGULAR_2:{
					new AngularDois(p);
					break;
				}
				case TRADICIONAL:{
					new Tradicional(p);
					break;
				}
				default:{
					new Tradicional(p);
				}
			
			}
			
			
			/*
			
			//dos modulos
			for(Modulo m: p.getListModulo()){
				String url = p.getSistema().getUrl()+"/client/src/app/"+m.getNome();
				
				File dir =new File(url);
				if(!dir.exists()){
					dir.mkdirs();
				}
				
				
				
				if(!m.isProducao()){
					File ts = new File(url+"/"+m.getNome()+".component.ts");
					File html = new File(url+"/"+m.getNome()+".component.html");
					File css = new File(url+"/"+m.getNome()+".component.css");
					
					if(ts.exists()){
						ts.delete();
					}
					
					if(html.exists()){
						html.delete();
					}
					
					if(css.exists()){
						css.delete();
					}
					
					Util.gravarArquivo(html, m.codigoHtml());
					Util.gravarArquivo(css, m.codigoCss());
					Util.gravarArquivo(ts, m.codigoTs());
				}
			}*/
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
