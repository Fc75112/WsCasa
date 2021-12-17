
import java.util.Scanner;
public class Ejercicio4_10{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String fecha = "";
		char sexo = 0;
		char curso = 0;
		char letra;
		String codigo= "";
		int error = 0;
		int contador1M = 0;
		int contador2M = 0;
		int contador1H = 0;
		int contador2H = 0;
		final String cadena0 = "00000000";

		// Leer número
		while (!codigo.equals(cadena0)) {
			System.out.println("Escriba un código de 8 carácteres");
			codigo = teclado.nextLine();
			
				// Asignar los caracteres con cada función
				for (int a = 0; a < 6; a++) {
					letra = codigo.charAt(a);
					if (a < 4) {
						fecha += letra;
					}
					if (a == 4) {
						sexo = letra;
					}
					if (a == 5) {
						curso = letra;
					}
				}
				// Valores admitidos de la variable fecha
				String f1 = "1990";
				String f2 = "1991";
				String f3 = "1992";
				String f4 = "1993";
				String f5 = "1994";
				String f6 = "1995";
				
					//	Comprobación de errores
				if(!codigo.equals(cadena0)) {
					if (fecha.equals(f1) || fecha.equals(f2) || fecha.equals(f3) || fecha.equals(f4) || fecha.equals(f5) || fecha.equals(f6) ) {
						switch (curso) {
						case '1':
							switch (sexo) {
							case 'M','m':
								contador1M++;
								break;
							case 'H','h':
								contador1H++;
								break;
							default:
								error++;
							}
							break;
						case '2':
							switch (sexo) {
							case 'M','m':
								contador2M++;
								break;
							case 'H','h':
								contador2H++;
								break;
							default:
							error++;
							}
							break;
						default:
							error++;
						}
					}else {
						error++;
					}
				}
					
					// Vacio el string de fecha para que la fecha sea solo de un codigo
					fecha = ""; 
				
				
			
			
				
			
			
		}
		// Impresión de los resultados
		System.out.println("En el primer curso hay: " + contador1M +" mujeres y " + contador1H + " hombres y en el segundo curso hay: " + contador2M + " mujeres y " + contador2H + " hombres." );
		System.out.println("El número de códigos erróneos ha sido de: " + error);
		
					
				
		
		
	}
}