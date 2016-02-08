package Marco.GITI7083.proyecto;

import java.util.Date;

public class Viaje {
	
	//atributos de la clase Viaje
	private int limite;
	private boolean trasnporte;
	private String motivo, estado;
	private Date fechaida,fechaVuelta;

	//hacemos las relaciones con las clases Comercial, Presupuesto y Gasto
	private Presupuesto serealizaentiene;
	
	//hacemos el constructor de la clase
	public Viaje(Comercial comerciales1, Presupuesto presupuesto, Gasto gastos){
		
	}
}
