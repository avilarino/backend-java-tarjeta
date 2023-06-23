package Tarjeta;

public class Test {

	public static void main(String[] args) {
		
		Tarjeta tarjeta1 = new Tarjeta("233", "juan", 10000);
		
		tester(tarjeta1);
		
	}
	
	public static void tester(Tarjeta tarjeta) {
	

        tarjeta.realizarCompra(4000);
        System.out.println(tarjeta.toString());  // Mostrar estado después de la compra

        tarjeta.actualizarLimite(3000);
        tarjeta.realizarCompra(4000);
        System.out.println(tarjeta.toString());  // Mostrar estado después del intento de compra
    
		
	}

}
