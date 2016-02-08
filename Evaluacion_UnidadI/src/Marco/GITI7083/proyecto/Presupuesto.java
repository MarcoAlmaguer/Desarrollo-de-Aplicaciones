package Marco.GITI7083.proyecto;

import java.util.Date;
import java.util.List;

public class Presupuesto implements IConsultarEstado {
	
	//atributos de la clase Presupuesto
	private Date fecha;
	private String descripcion, estado;
	private double importe;
	
	private List<DeptComercial>presupuestos;
	private List<Viaje>presupuestosV;
	
	public Presupuesto(Cliente clientes,Proyecto proyecto){
		
	}

	
	@Override
	public void consultarEstado() {
		// TODO Auto-generated method stub
		
	}
	
	

}
