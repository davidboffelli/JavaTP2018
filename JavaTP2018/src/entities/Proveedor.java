package entities;

public class Proveedor {
	private String razonSocial;
	private long cuitCuil;
	
	public Proveedor () {
		
	}
	public Proveedor(String razonSocial, long cuitCuil) {
		super();
		this.razonSocial = razonSocial;
		this.cuitCuil = cuitCuil;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public long getCuitCuil() {
		return cuitCuil;
	}
	public void setCuitCuil(long cuitCuil) {
		this.cuitCuil = cuitCuil;
	}	

	
}
