package entities;

public class Pedido {

	private int idPedido;
	private String estado;
	private Cliente cliente;
	private Producto productos;
	private String fechaHora;
	// se podria agregar cantidad de productos, algun tipo de descuentos
	// gastos de envio, si lo retira en tiendo o a domicilio
	
	public Pedido (){}
	public Pedido(int idPedido, String estado, Cliente cliente, Producto productos, String fechaHora) {
		this.idPedido = idPedido;
		this.estado = estado;
		this.cliente = cliente;
		this.productos = productos;
		this.fechaHora = fechaHora;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProductos() {
		return productos;
	}
	public void setProductos(Producto productos) {
		this.productos = productos;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	
}
