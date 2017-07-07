package com.beeva.spring.accountSpring;


public class CuentaDAOFactory {

	public CuentaDAOFactory() {
	}
	
	public CuentaDAO getImplementacion(Cuenta mi_cuenta){
		if(mi_cuenta.getTipo().equals("ahorro")){
			CuentaDAO account = new CuentaImplAhorro();
			return account;
		}else{
			CuentaDAO account = new CuentaImplCheques();
			return  account;
		}
	}

}
