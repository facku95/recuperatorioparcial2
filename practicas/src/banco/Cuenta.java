package banco;

public abstract class Cuenta {
	protected Double saldo;
	protected Double deuda=0.0;
	public Cuenta(Double saldo,Double deuda) {
		this.saldo = saldo;
		this.deuda=deuda;
		
	}
	
public abstract String Extraccion(Double monto);

public boolean ComprobarVip() {
	if (deuda==0&&saldo>1000000) {
		return true;
	}
	else return false;
}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}

public Double getDeuda() {
	return deuda;
}

public void setDeuda(Double deuda) {
	this.deuda = deuda;
}


}
