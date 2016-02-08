package Marco.GITI7083.proyecto;

import java.util.Date;
import java.util.List;

public class Proyecto {

	
	private String nombre,planificacion,descripcion,estado;
	private Date fechainicio,fechafin;
	
	//relacionamos con la clase presupuesto
	private List<Presupuesto>presupuestosP;
	
	//realacionamos con clase Maquina
	private Maquina tieneAsignadas
	;
	
	//creamos el constructor de la clase
	public Proyecto(Presupuesto presupuestosP, Maquina maquinas){
		
	}
	
}
