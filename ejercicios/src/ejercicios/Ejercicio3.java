/**
 * 
 */
package ejercicios;
import java.util.Scanner;

/**
 * @author Antonio
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un numero para calcular sus divisores propios");
		n=teclado.nextInt();
		System.out.print(n + " ");
		int contador = n/2;
		
		while (contador!=0){
			if(n%contador==0) {
				System.out.print(contador + " ");
				contador--;
			}else {
				contador--;
			}

		}
		
}
	}
