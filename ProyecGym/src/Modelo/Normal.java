package Modelo;

public class Normal {
	
	private String numCuenta;
	private String nombrenorm;
	private int pagoins;
	
	
	public Normal() {
		
		
		
	}


	public Normal(String numCuenta, String nombrenorm, int pagoins) {
		super();
		this.numCuenta = numCuenta;
		this.nombrenorm = nombrenorm;
		this.pagoins = pagoins;
	}


	@Override
	public String toString() {
		return "Normal [numCuenta=" + numCuenta + ", nombrenorm=" + nombrenorm + ", pagoins=" + pagoins + "]\n";
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public String getNombrenorm() {
		return nombrenorm;
	}


	public void setNombrenorm(String nombrenorm) {
		this.nombrenorm = nombrenorm;
	}


	public int getPagoins() {
		return pagoins;
	}


	public void setPagoins(int pagoins) {
		this.pagoins = pagoins;
	}
	
	
	

}
