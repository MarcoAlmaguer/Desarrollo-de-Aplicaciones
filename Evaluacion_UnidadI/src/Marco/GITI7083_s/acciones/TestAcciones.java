package Marco.GITI7083_s.acciones;

public class TestAcciones {
	
	public static void main(String[] args) {
	
		//instanciamos la clase hombre para poder traernos los metodos bailar estudiar etc.
		Hombre hombre = new Hombre();
		hombre.bailar();
		hombre.tocarInstrumento();
		hombre.estudiar();
		hombre.trabajar();
		
		//Instanciamos la clase mujer y nos traemos sus metodos
		Mujer mujer = new Mujer();
		mujer.hablar();
		mujer.jugar();
		mujer.dormir();
		
		//instanciamos la clase perro y traemos sus metodos de esa clase que hereda de la clase Animal
		// que a su vez se trae de la interfaz AccionesSeresVivos
		Perro hachiko = new Perro();
		hachiko.alimentarse();
		hachiko.dormir();
		hachiko.desplazarse();
		
	}

}
