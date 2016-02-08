package GITI7083_s.Marco.animal;
//creamos la clase TestAnimal
public class TestAnimal {

	
	public TestAnimal(){
		
	}

    public static void main(String[] args) {
    	
    	//creamos un nuevo objeto prueba de la clase TestAnimal
		
		Perro perro = new Perro();
		Gato gato = new Gato();
		
		//creamo una instancia con la clase perro y gato que sera almacenada en la variable prueba
		
		
		perro.setNombre("Aquiles");
		perro.comunicarse();
		System.out.println("El nombre del perro es:" + perro.getNombre());
		
		gato.setNombre("Bola de Nieve");
		gato.comunicarse();
		System.out.println("El nombre del gato es:" + gato.getNombre());
		
	}
    
    
    
	

}
