package Marco.GITI7083.figuras;

public class Circulo extends Figura{
	private double radio = 6;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double areaCirculo(){
		
		return 3.1416*radio*radio;
	}

}
