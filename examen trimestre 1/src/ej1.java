import java.util.Scanner;
public class ej1 {
// programa que realizaz una tabla segun el numero n que se le introduce
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime un numero de filas");
		int n = teclado.nextInt();
		if(n>0) {
			System.out.println("n = "+n);
			System.out.println();
			for(int contador=0;contador<n;contador++) {
				for(int contesp=n-contador;contesp>0;contesp--) {System.out.print(" ");}
				for(int contapo=0;contapo<=contador;contapo++) {System.out.print("*");}
				System.out.println();
			}
		}else {System.out.println("Numero no valido (menor que 0)");}
	}

}
