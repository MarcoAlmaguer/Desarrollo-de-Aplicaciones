package Marco.GITI7083.proyecto;

import java.util.List;

public class Comercial implements IConsultarEstado{

	//atributos de la clase Coemrcial
	private String estado,nombre,apellidos,telefono,domicilio,rfc;
	

	//Hacemos la relacion con la clase DeptComercial
	private List<DeptComercial>comerciales;
		
		
	//hacemos la relación con la clase viaje
	private Viaje realizar;
		
		
	//hacemos el constructor de la clase
	public Comercial(Viaje viaje){
		
	}

	@Override
	public void consultarEstado() {
		// TODO Auto-generated method stub
		
	}

}
