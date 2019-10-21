package es.studium.ConcatenarCaracteres;

import java.util.Scanner;

public class ConcatenarCaracteres {


	public static void main(String[] args)
	{
		char a, b; 
		String resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la primera letra:");
		a=teclado.next().charAt(0);
		System.out.println("Introduce otra letra:");
		b=teclado.next().charAt(0);

		resultado = (a+"" + b);
		System.out.println(resultado);
		teclado.close();

	}

}
