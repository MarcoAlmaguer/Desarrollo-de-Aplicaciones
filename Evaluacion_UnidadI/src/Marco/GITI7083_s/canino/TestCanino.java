package Marco.GITI7083_s.canino;

public class TestCanino {
	
	
	public static void main(String[] args) {
		Canino canino = new Perro(){
			public void dormir(){
				
			}
		};
		System.out.println("Perro");
		canino.rugir();
		canino.comer();
		canino.hacerRuido();
		canino.dormir();
	    
	}

}
