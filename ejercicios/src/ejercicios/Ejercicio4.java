/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Antonio
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un numero para saber si es primo o no");
		n=teclado.nextInt();
		int contador = n;
		boolean x= true;
		while (x==true){
			if(n%(contador/2+1)==0) {
				System.out.print("no es primo");
				x=false;
			}else {
				contador--;
				
				x=false;
			}
		}
		}
		}
/*
}else if(n%(contador/2+1)==0){
				System.out.print("es primo1");
				x=false;
			}else {
				contador--;
				System.out.print("es primo2");
				x=false;
			}
			*/
