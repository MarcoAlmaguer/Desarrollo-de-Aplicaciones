package Marco.GITI7083.figuras;

public class Cuadrado extends Figura{
	
	private int lado = 8;
	
	public int areaCuadrado() {
		return  lado*lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	

}
