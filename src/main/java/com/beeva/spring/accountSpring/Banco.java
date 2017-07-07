package com.beeva.spring.accountSpring;

import java.util.List;

public class Banco {
	
	private int num_clientes = 0;
	private List<Cliente> lista_clientes;
		
	public Banco(){
		
	}

	public int getNum_clientes() {
		return num_clientes;
	}

	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}

	public List<Cliente> getLista_clientes() {
		return lista_clientes;
	}

	public void setLista_clientes(List<Cliente> lista_clientes) {
		this.lista_clientes = lista_clientes;
		
	}
	
	

}
