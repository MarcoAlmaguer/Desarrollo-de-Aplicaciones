package Marco.GITI7083.figuras;


public class testFigura {
	
	

	
	
	public static void main(String[] args) {
		//realizamos la prueba instanciando la clase cuadrado para traernos el metodo de calcular area
		Cuadrado cuadrado = new Cuadrado();
		int area = cuadrado.areaCuadrado();
		System.out.println("area del cuadrado:" + area);

		Circulo circulo = new Circulo();
		double areaC = circulo.areaCirculo();
		System.out.println("Area del Circulo:" + areaC);
	}

}
