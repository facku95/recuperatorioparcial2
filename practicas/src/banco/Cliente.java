package banco;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private Integer dni;
	private ArrayList <Cuenta> cuentasClientes = new ArrayList();  
	
	public Cliente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	
	
public void AgregarCuenta() {
	
}
	
	

}
