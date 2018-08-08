package entities;

public class Factura {

	private int nroFactura;
	private Pedido pedido;
	private String fechaHora;
	private String estado;
	private float importe;
	//podria ir la forma de pago tambien que sea una clase la forma de pago 
	// y pondriamos las formas de pago como con MERCADO PAGO
	// creo aca tambien habria que agregar el cliente
	public Factura() {}
	public Factura(int nroFactura, Pedido pedido, String fechaHora, String estado, float importe) {
		this.nroFactura = nroFactura;
		this.pedido = pedido;
		this.fechaHora = fechaHora;
		this.estado = estado;
		this.importe = importe;
	}
	public int getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	
}
