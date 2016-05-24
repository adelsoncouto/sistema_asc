package br.com.adelsoncouto.componente;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private Sistema sistema;
	private List<Modulo> listModulo = new ArrayList<>();

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public List<Modulo> getListModulo() {
		return listModulo;
	}

	public void setListModulo(List<Modulo> listModulo) {
		this.listModulo = listModulo;
	}
	
}
