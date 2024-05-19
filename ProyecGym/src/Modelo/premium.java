package Modelo;

public class premium {
	
	private String numCuentap;
	private String nombrep;
	private int pagoinsp;
	
	public premium() {
		
	}

	public premium(String numCuentap, String nombrep, int pagoinsp) {
		super();
		this.numCuentap = numCuentap;
		this.nombrep = nombrep;
		this.pagoinsp = pagoinsp;
	}

	@Override
	public String toString() {
		return "premium [numCuentap=" + numCuentap + ", nombrep=" + nombrep + ", pagoinsp=" + pagoinsp + "]";
	}

	public String getNumCuentap() {
		return numCuentap;
	}

	public void setNumCuentap(String numCuentap) {
		this.numCuentap = numCuentap;
	}

	public String getNombrep() {
		return nombrep;
	}

	public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
	}

	public int getPagoinsp() {
		return pagoinsp;
	}

	public void setPagoinsp(int pagoinsp) {
		this.pagoinsp = pagoinsp;
	}

	
	
}
