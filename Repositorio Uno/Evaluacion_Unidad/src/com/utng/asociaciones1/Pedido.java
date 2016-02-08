package com.utng.asociaciones1;

import java.util.Date;
import java.util.List;

public class Pedido {

	
	//Atrributos de la clase Pedido
	private double pe_id;
	private Date pe_fechaPedido,pe_fechaNecesidad,pe_fechaProgramada,pe_fechaEntrega;
	private int pe_estado;
	
	private List<Articulo> articulo;
	
	
	//constructor de la clase
	public Pedido(){
		
	}
}
