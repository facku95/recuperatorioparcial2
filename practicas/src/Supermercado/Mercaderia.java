package Supermercado;

public abstract class Mercaderia {
	public Integer precio;
	public String nombre;
	public Proveedor proveedor;
	public Integer id;
	
public Mercaderia(Integer precio, String nombre, Proveedor proveedor, Integer id) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.id = id;
	}
	
	
	
	
}
