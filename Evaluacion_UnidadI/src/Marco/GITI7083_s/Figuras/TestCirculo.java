package Marco.GITI7083_s.Figuras;

import java.util.Scanner;

public class TestCirculo {
	
	private static double radio;
	
	private static double pi = 3.1416;
	private double area;
	
	public static void main(String[] args) {
		
		System.out.println("Ingresa el Radio = ");
		Scanner scanner = new Scanner(System.in);
		radio = scanner.nextFloat();
		double area = (pi *radio*radio);
		System.out.println("Area = " + area);
		
	}

}
