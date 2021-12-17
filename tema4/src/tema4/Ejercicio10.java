package tema4;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int contadornovalido=0;
	boolean end=true;
	String año="";
	String gen="";
	String curso="";
	int H1=0;
	int H2=0;
	int M1=0;
	int M2=0;
	char letra;
	while(end==true) {
		System.out.println("Dime un codigo");
		String frase=teclado.next();
		if(frase.equals("00000000")) {
			end=false;
		}else {
			for(int contador=0;contador<=6;contador++) {
				letra=frase.charAt(contador);
				if(contador<4) {
					año+=letra;
				}else if(contador ==4) {
					gen+=letra;
				}else if(contador ==5) {
					curso+=letra;
				}
			}
			if(año.equals("1990")||año.equals("1991")||año.equals("1992")||año.equals("1993")||año.equals("1994")||año.equals("1995")) {
				
				if(gen.equals("H")) {
					if(curso.equals("1")) {
						H1++;
					}else if(curso.equals("2")) {
						H2++;
					}else {contadornovalido++;System.out.println("Codigo no valido");}
				}else if(gen.equals("M")) {
					if(curso.equals("1")) {
						M1++;
					}else if(curso.equals("2")) {
						M2++;
					}else {contadornovalido++;System.out.println("Codigo no valido");}
				}else{contadornovalido++;System.out.println("Codigo no valido");}
			}else {contadornovalido++;System.out.println("Codigo no valido");}
			System.out.println(gen);
			System.out.println(curso);
			año="";
			gen="";
			curso="";
		}
	}
	System.out.println("En el curso 1 hay "+M1+" Mujeres");
	System.out.println("En el curso 1 hay "+H1+" Hombres");
	System.out.println("En el curso 2 hay "+H2+" Hombres");
	System.out.println("En el curso 2 hay "+M2+" Mujeres");
	System.out.println("Codigos no validos: "+contadornovalido);
	}

}
