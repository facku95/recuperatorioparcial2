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
		}

	}

}
