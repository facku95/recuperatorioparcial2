package Supermercado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		try {
		Scanner teclado=new Scanner(System.in);
		System.out.println("INGRESE UN NUMERO:");
		b=teclado.nextInt();
		System.out.print(b);
		}catch(InputMismatchException e) {
			System.out.println("SE INGRESO UN CARACTER QUE NO ES NUMERICO");
/*
enunciado:
1-cargar los productos en sistema
2-modificar precios
3-consultar stock
4-consultar si proveedor entrega
5-registrar ventas
////////////////////
public abstract class Mercaderia{
  public Integer id;
  public Integer precio;
  public String nombre;
  public Proveedor proveedor;
public mercaderia(Integer id, Integer precio,String nombre
		  Proveedor proveedor){
 this.id=id;
 this.precio=precio;
 this.nombre=nombre;
 this.proveedor=proveedor;
 
 }
public String ComprobarDeliveryProveedor(Proveedor proveedor){
String estado="";
  if(proveedor.getDelivery==true){
   estado="realiza envios"}else{estado="no realiza envios"}return estado;}
public void ModificarPrecio(Integer newprice){
precio=newprice}
public abstract string ComprobarStock();
public abstract void RegistrarVenta();
}
/////////////////////////
public class Bebidas extends Mercaderia{
  public Double contenido;
  public Integer cajones;
  public Integer stock=0;
public Bebidas(Double contenido,Integer cajones,Integer stock){
  this.contenido=contenido;
  this.marca=cajones;
  this.stock=stock;
  } 
@Override
public string ComprobarStock(){
  string estado=""+getNombre+" stock de: "+stock;return estado;}
@Override
public void RegistrarVenta(Integer n){
setPrecio()=getPrecio()-n;}
}
/////////////////////////
public class Galletitas extends Mercaderia{
  public Double pesoxpaquete;
public Galletitas(Double peso){
  this.pesoxpaquete=peso;}
@Override
public string ComprobarStock(){
String estado=""+getNombre+"stock de: "+getStock;}
}
/////////////////////////
@Test
public void QueSeCompruebeElStock(){
}
/////////////////////////
public class Proveedor(){
  public String nombre;
  public Integer cuil;
  public String direccion;
  public Boolean delivery=false;

public Proveedor(String nombre,Integer cuil,String direccion,
					Boolean delivery){
  this.nombre=nombre;
  this.cuil=cuil;
  this.direccion=direccion;
  this.delivery=delivery;
}}
//////////////////////////
*/
		}

	}

}
