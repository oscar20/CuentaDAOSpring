package com.beeva.spring.accountSpring;

public interface CuentaDAO { //Sera la interfaz

	//Solo declaro los metodos de la interfaz sin un comportamiento
	public void deposito(double b);
	
	public void retiro(Cliente c,double b);

}
