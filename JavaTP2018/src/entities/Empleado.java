package entities;

public class Empleado extends Persona{
	
	private String nroEmpleado;	
	private String tipo;
	public Empleado() {
		
	}
	public Empleado(String nroEmpleado, String tipo) {
		super();
		this.nroEmpleado = nroEmpleado;
		this.tipo = tipo;
	}
	
	public String getNroEmpleado() {
		return nroEmpleado;
	}
	public void setNroEmpleado(String nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
