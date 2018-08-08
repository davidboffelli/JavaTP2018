package entities;

public class Cliente extends Persona{
	
	private long nroCliente;
	private long nroCuilCuit;
	private boolean conCuentaCorriente;
	
	
	public Cliente() {
	}
	public Cliente(long nroCuilCuit, boolean conCuentaCorriente) {
		super();
		this.nroCuilCuit = nroCuilCuit;
		this.conCuentaCorriente = conCuentaCorriente;
	}
	public long getNroCuilCuit() {
		return nroCuilCuit;
	}
	public void setNroCuilCuit(long nroCuilCuit) {
		this.nroCuilCuit = nroCuilCuit;
	}
	public boolean isConCuentaCorriente() {
		return conCuentaCorriente;
	}
	public void setConCuentaCorriente(boolean conCuentaCorriente) {
		this.conCuentaCorriente = conCuentaCorriente;
	}
	public long getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(long nroCliente) {
		this.nroCliente = nroCliente;
	}
	
	
}
