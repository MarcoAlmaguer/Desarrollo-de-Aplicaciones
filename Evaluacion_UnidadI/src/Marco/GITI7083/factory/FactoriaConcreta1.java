package Marco.GITI7083.factory;

public class FactoriaConcreta1 implements AbstractFactory {
	
	
	//traemos los metodos de la interface AbstractFactory ya que lal estamos implementando
	@Override
	public void crearProductoA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearProdcutoB() {
		// TODO Auto-generated method stub
		
	}
	
	
	public Object ProductoA1(ProductoA1 productoa1){
		return productoa1;
	}
	
	public Object ProductoB1(ProductoB1 productob1){
		return productob1;
	}
	

}
