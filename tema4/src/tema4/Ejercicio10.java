package tema4; 
/*10) Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro
primeros sean num�ricos y contenidos entre 1990-1995 (un a�o), el quinto car�cter sea solo (H
� M) sexo, el sexto un n�mero que representa el curso 1 � 2 y los caracteres s�ptimo y octavo
pueden tener cualquier valor. Deben rechazarse los c�digos que no cumplan estas condiciones.
La finalizaci�n de entrada de c�digos se produce cuando se introduce el c�digo �00000000�.
Al final, el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay
matriculados en primero y segundo y cu�ntos c�digos correctos han sido le�dos.*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		
		int caracteres;
		int mujeresprimero=0;
		int mujeressegundo=0;
		int hombresprimero=0;
		int hombressegundo=0;
		boolean condicion= true;
		
		
		while(condicion==true) {
		System.out.println("Escriba su numero");	
		frase= teclado.nextLine();
		caracteres= frase.length();
		if (frase.equals("00000000")){
			condicion=false;} else {
		
		if (caracteres==8) {
			if (frase.substring(0,4).equals(""+1990)||frase.substring(0,4).equals(""+1991)||frase.substring(0,4).equals(""+1992)||frase.substring(0,4).equals(""+1993)||frase.substring(0,4).equals(""+1994)||frase.substring(0,4).equals(""+1995)) 
			{
				
				 if (frase.substring(4, 5).equals("H")||frase.substring(4, 5).equals("M")) {
					if (frase.substring(4, 5).equals("H")) {
					if (frase.substring(5, 6).equals("1")) {
						hombresprimero++;
						System.out.println(frase.substring(5,6));} 
						else if (frase.substring(5, 6).equals("2")) 
							{hombressegundo++;
							System.out.println(frase.substring(5,6));}
					}
					
					else if (frase.substring(4, 5).equals("M")) {
						if (frase.substring(5, 6).equals("1")) {
							System.out.println(frase.substring(5,6));
							mujeresprimero++;} else if (frase.substring(5, 6).equals("2")) {
								System.out.println(frase.substring(5,6));mujeressegundo++;}
					}} 
																	;}else {System.out.println("tiene que ser entre 1990 y 1995");}
			} else {System.out.print("no es valido, no son 8 digitos");}
						   }
		
		}

		System.out.println("el numero de hombres en primero es "+ hombresprimero);
		System.out.println("el numero de hombres en segundo es "+ hombressegundo);
		System.out.println("el numero de mujeres en primero es "+ mujeresprimero);
		System.out.println("el numero de mujeres en segundo es "+ mujeressegundo);	
		}
		
		
	}

