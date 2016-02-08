package Marco.GITI7083.factory;

public  class Cliente {
	
	public static void main(String[] args) {
		ProductoA productoa = new ProductoA(){
			
		};
		
		ProductoB productob = new ProductoB(){
			
		};
				
		AbstractFactory abstractFactory = new AbstractFactory() {
			
			@Override
			public void crearProductoA() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void crearProdcutoB() {
				// TODO Auto-generated method stub
				
			}
		};
	}	

}
