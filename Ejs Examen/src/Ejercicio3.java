import java.util.Scanner;

/**
 * @author Antonio
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String palabra;
		int letra;
		boolean pcorrecta=false;
		System.out.println("Dame una frase");
		frase= teclado.nextLine();
		System.out.println("Dame una palabra");
		palabra= teclado.nextLine();
		int caracteres= frase.length();
		for(int p1=0;p1<frase.length();p1++) {
			letra=frase.charAt(p1);
			for(int numeropalabra=palabra.length();numeropalabra>0;numeropalabra--)
			if(frase==palabra) {
				System.out.println("h");
			}

		}
	}
}
/*
 * 		int letra;
		int contador=0;
		int letraP;
 *
 * if(letra==palabra.charAt(0)) {
				pcorrecta=true;
				int p2=p1;
				for(int j=1;j<palabra.length()&&pcorrecta==true;p2++) {
					letraP=palabra.charAt(j);
					if(letra!=letraP) {
						pcorrecta=false;
					}
				}
			}
			if(pcorrecta==true) {
				contador++;
				pcorrecta=false;
			}
			System.out.println("Contador de coincidencias: "+contador);	
 */