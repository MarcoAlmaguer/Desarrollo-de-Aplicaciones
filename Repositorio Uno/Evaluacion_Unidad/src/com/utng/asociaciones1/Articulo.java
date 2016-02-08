package com.utng.asociaciones1;

import java.util.List;

public class Articulo {
	
	private String art_ID,art_descripcion;
	private int art_estado,art_cantidad,art_tipo;
	private double art_cantidadCritica, art_cantidadMinima;
	
	
	private Precios precios;
	private Proveedor proveedor;
	private List<Rubro> rubro;
	
	
	//contructor de la clase Articulo
	public Articulo(){
		
	}
	

}
