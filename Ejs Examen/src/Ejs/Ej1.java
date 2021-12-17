package Ejs;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dime un numero de columnas");
		int n =teclado.nextInt();
		int x=1;
		int y=n;
		for(int contotal=0;contotal!=n;contotal++) {
			System.out.println();
			for(int contesp=y-1;contesp!=0;contesp--) {
				System.out.print(" ");
			}
			for(int cont=0; cont<x;cont++) {
				System.out.print("x");
			}
			x++;
			y--;
		}
	}

}
