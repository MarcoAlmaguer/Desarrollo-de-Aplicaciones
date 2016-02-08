package com.utng.asociaciones2;

import java.util.List;

public class Orden {
	
	//atributos de la clase orden
	private int hora;
	private String mesero;
	
	
	private Pago pago;
	private Cliente ordena;
	private List<Bebida> bebida;
	private List<Platillo> platillo; 
	
	//constructor
	public Orden(){
		
		
	}
	
	public List<Bebida>getBebida(){
		return bebida;
	}
	public void setBebida(List<Bebida> bebida){
		this.bebida = bebida;
	}

}
