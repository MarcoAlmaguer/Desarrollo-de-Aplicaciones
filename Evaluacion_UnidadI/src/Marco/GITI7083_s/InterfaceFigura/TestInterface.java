package Marco.GITI7083_s.InterfaceFigura;

import java.util.Scanner;

public class TestInterface implements Figura{
	

	
	public static void main(String[] args) {
		Figura figura = new Figura(){
			Triangulo triangulo = new Triangulo();
			Cuadrado cuadrado = new Cuadrado();
			Circulo circulo = new Circulo();
		};
	}
}
