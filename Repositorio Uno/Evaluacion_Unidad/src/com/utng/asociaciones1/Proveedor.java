package com.utng.asociaciones1;

import java.util.List;

public class Proveedor {
	
	//atributos de la clase Proveedor
	private double pr_ID;
	private String pr_RazonSocial,pr_contacto_pr_telefono1,pr_telefono2;
	private String pr_fax_,pr_email1,pr_email2,pr_web;
	private int pr_CUIT;
	
	
	private List<Rubro>rubro;
	private List<Direccion> dir;
	private Precios precios;
	private Articulo articulo;
	private Calificacion cal;
	
	
	//constructor de la clase
	public Proveedor(){
		
	}

}
