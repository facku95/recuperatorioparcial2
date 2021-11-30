package banco;

public class CuentaCorriente extends Cuenta{
	private Double descubierto=150.0;

	public CuentaCorriente(Double monto,Double deuda,Double descubierto) {
		super(monto,deuda);
		this.descubierto=descubierto;
	}
@Override
public String Extraccion(Double monto) {
	String mensaje="";
	if(monto<=saldo) {
		saldo-=monto;
		mensaje="Nuevo saldo= $"+saldo;
	}else {if(monto>=saldo&&monto<(saldo+descubierto)) {
		deuda=(monto-saldo)*1.05;
		descubierto-=deuda;
		saldo=0.0;
		mensaje="Nuevo saldo= $"+saldo+"\n"+"Deuda con el banco= $"+deuda;
	}else {mensaje="No se pudo completar la operacion.";}
		
	}
	
	return mensaje;
}


	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}
}
