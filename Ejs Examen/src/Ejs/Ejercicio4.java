package Ejs;
import java.util.Scanner;
/*Hacer un programa que lea una frase y luego una palabra; y nos diga cuántas
veces está la palabra en la frase. Es obligatorio que la palabra solo posea letras o
números y ningún otro tipo de carácter.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		String frase="";
		String palabra="";
		System.out.println("Introduce la frase");
		frase= teclado.nextLine();
		System.out.println("introduce la palabra a buscar");
		palabra= teclado.next();
		/*algoritmo:
		 * recorrer la frase de char 0 al final, cuando se detecta un espacio se vuelve a empezar el bucleo de comparacion con palabra
		 * 
		 * 
		 */
		int caracteres=0;
		char letra=' ';
		int posicionpalabra=0;
		int contador=1;
		int posicionletra=0;
		String palabraactual="";
		boolean espacio=false;
		
		int palabraveces=0;
		caracteres=frase.length();
		do {
			 while(posicionletra<caracteres&&espacio==false) {
					letra=frase.charAt(posicionletra);
					if(letra==' ') {espacio=true;}
					else{palabraactual+=letra;}
					posicionletra++;
					}
				espacio=false;
				if (palabraactual.equals(palabra)) {palabraveces++;}
				palabraactual="";
				
				contador++;	
			}
			
		while (contador<caracteres);
		System.out.println("se encuentra un total de "+palabraveces);
			
		}
		
	}