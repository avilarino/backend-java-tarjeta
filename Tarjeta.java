package Tarjeta;


public class Tarjeta {
	
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	Tarjeta(String numero, String titular, double limiteDeCompra){
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
	}

	private String getNumero() {
		return numero;
	}

	private String getTitular() {
		return titular;
	}

	private double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	private double getAcumuladoActual() {
		return acumuladoActual;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	public double montoDisponible() {
		double total;
	
		total = this.limiteDeCompra - this.acumuladoActual;
		if(total <= 0) {
			total = 0;
		}
		
		return total;
	}
	
	private boolean compraPosible(double monto) {
		boolean compra;
		if(monto <= this.montoDisponible()) {
			compra = true;
		} else {
			compra = false;
		}
		return compra;
	}
	
	
	public void actualizarLimite(double nuevoLimite) {
		this.setLimiteDeCompra(nuevoLimite);
	}
	
	private void acumularGastoActual(double compra) {
		this.acumuladoActual += compra;
	}
	
	public boolean realizarCompra(double monto) {
		boolean compra;
		if(monto <= this.limiteDeCompra) {
			compra = true;
			this.acumularGastoActual(monto);
		} else {
			compra = false;
		}
		return compra;
	}

	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", getNumero()=" + getNumero() + ", getTitular()="
				+ getTitular() + ", getLimiteDeCompra()=" + getLimiteDeCompra() + ", getAcumuladoActual()="
				+ getAcumuladoActual() + ", montoDisponible()=" + montoDisponible() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
