package banco;

public class CuentaSueldo extends Cuenta{
	
	public CuentaSueldo(Double saldo,Double deuda) {
		super(saldo,deuda);
		
	}

	@Override
	public String Extraccion(Double monto) {
		String mensaje="";
		if (monto<=saldo) {
			saldo-=monto;
			mensaje="Nuevo saldo= $"+saldo;
		}else {mensaje="La operacion no se pudo efectuar por falta de fondos";}
		return mensaje;
	}

	//@Override
/*	public boolean ComprobarVip(Cliente cliente) {
		if(cliente.g) {
			
		}
		return false;
	}*/
	

	
}
