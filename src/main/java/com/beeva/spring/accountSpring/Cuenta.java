package com.beeva.spring.accountSpring;

public class Cuenta {
	
	private double balance; //Variable balance de cuenta, es protegida para poder acceder desde la clase heredada
	private String tipo;
	
	public Cuenta(double balance){ //Constructor 
		this.balance = balance;
	}
	
	public void setbalance(double balance){
		this.balance = balance ; 
	}
	
	public double getbalance(){
		return this.balance;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
