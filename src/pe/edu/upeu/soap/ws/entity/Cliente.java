package pe.edu.upeu.soap.ws.entity;

public class Cliente {
	private int idcliente;
	private String direccion;
	private String dni;
	private String nombre;
	private String fecha;
	private String producto;
	private String documento;
	private String numero;
	private String cantidad;
	private String stock;
	private String subtotal;
	public Cliente(int idcliente, String direccion, String dni, String nombre, String fecha, String producto,
			String documento, String numero, String cantidad, String stock, String subtotal) {
		super();
		this.idcliente = idcliente;
		this.direccion = direccion;
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.producto = producto;
		this.documento = documento;
		this.numero = numero;
		this.cantidad = cantidad;
		this.stock = stock;
		this.subtotal = subtotal;
	}
	
	
	
	public Cliente() {
		super();
	}



	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	
}
