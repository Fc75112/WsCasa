package ejercicios;
/*Autor: yo
 * fecha: hoy
 * programa que lea una serie de n�meros por teclado de manera que cuando el n�mero
le�do sea el cero ya no se introduzcan m�s; el programa debe calcular y escribir la suma de los
n�meros de la serie y cu�ntos se han introducido en total.
 */

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador=0;
		int suma=0;
		boolean serie=true;
		System.out.println("Introduce un numero");
		while (serie==true) {//declaramos un booleano como condicion que sera true hasta que el numero introducido sea 0
			numero= teclado.nextInt();
			contador++;
			suma+=numero;
			if (numero==0)
			serie=false;
			
	}
System.out.println("La suma de los numeros es "+suma);
System.out.println("El total de numeros ha sido de "+contador);
}
}
