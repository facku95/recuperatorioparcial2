package banco;

public class CajaDeAhorro extends Cuenta{
	private int nExtraccion=0;

	public CajaDeAhorro(Double saldo,Double deuda,int nExt) {
		super(saldo,deuda);
		this.nExtraccion=nExt;
	}
	
	@Override
	public String Extraccion(Double monto) {
		String mensaje="";
		if(monto<=saldo&&nExtraccion<=5) {
			saldo-=monto;
			nExtraccion++;
			mensaje="Nuevo saldo= $"+saldo+"\n"+"Cantidad de extracciones sin costo= "+nExtraccion;
		}else {
			if(nExtraccion>5&&monto<(saldo-6)) {
				saldo=saldo-monto-6;
				mensaje="Nuevo saldo= $"+saldo+"\t"+"Se cobro $6 por extraccion adicional";
			}else {mensaje="No se pudo completar la extraccion";}
		}
		return mensaje;
	}

	
}
