import java.util.*;
public class ej2 {
//Programa para comprobar dni
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
	String letras="TRWAGMYFPDXBNJZSQVHLCKE";
	boolean verdadero=false;
	while(verdadero==false) {
		System.out.println("Introduce el numero de tu NIF");
		int num1=teclado.nextInt();
		if(num1<100000000&&num1>0) {
			System.out.println("Introduce la letra de tu NIF");
			String letra=teclado.next();
			letra=letra.toUpperCase();
			char letra1=letra.charAt(0);
			char comprobar=letras.charAt(num1%23);
			if (letra1==comprobar) {System.out.println("El dni es correcto");verdadero=true;
			}else {System.out.println("Letra incorrecta, vuelva a intentar");System.out.println(comprobar);}
		}else {System.out.println("El numero introducido no es correcto");}
	}
	}
}