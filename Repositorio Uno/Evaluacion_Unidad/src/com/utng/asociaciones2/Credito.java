package com.utng.asociaciones2;

import java.util.Date;

public class Credito extends Pago {
	
	//atributos de la clase credito
	private int numeroTdeCredito;
	private String tipo,nombre;
	private Date fechaDeExp;
	
	//cosntructor
	public Credito(){
		
	}
	
	//metodos de la clase Credito
	public double hacerCargo(double cargo){
		return 0;
	}
	

}
