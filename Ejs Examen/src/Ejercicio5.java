import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int dinero=1;
	boolean tirar=false;
	int respuesta;
	String d1="";
	String d2="";
	String d3="";
	while(dinero>0&&tirar==false) {
		System.out.println("¿Quieres tirar(1) o irte(2)?");
		respuesta = teclado.nextInt();
		if (respuesta==1) {
			int numerorandom1=(int)((Math.random()*10+1));
			int numerorandom2=(int)((Math.random()*10+1));
			int numerorandom3=(int)((Math.random()*10+1));
			if(numerorandom1>=1||numerorandom1<=3) {
				d1="$";
			}
			if(numerorandom1>=4||numerorandom1<=6) {
				d1="#";
			}
			if(numerorandom1==7) {
				d1="%";
			}
			if(numerorandom1==8) {
				d1="<";
			}
			if(numerorandom1==9) {
				d1=">";
			}
			if(numerorandom1==10){
				d1="@";
			}
			if(numerorandom2>=1||numerorandom2<=3) {
				d2="$";
			}
			if(numerorandom2>=4||numerorandom2<=6) {
				d2="#";
			}
			if(numerorandom2==7) {
				d2="%";
			}
			if(numerorandom2==8) {
				d2="<";
			}
			if(numerorandom2==9) {
				d2=">";
			}
			if(numerorandom2==10){
				d2="@";
			}
			if(numerorandom3>=1||numerorandom3<=3) {
				d3="$";
			}
			if(numerorandom3>=4||numerorandom3<=6) {
				d3="#";
			}
			if(numerorandom3==7) {
				d3="%";
			}
			if(numerorandom3==8) {
				d3="<";
			}
			if(numerorandom3==9) {
				d3=">";
			}
			if(numerorandom3==10){
				d3="@";
			}
			System.out.print(d1);
			System.out.print(d2);
			System.out.println(d3);
			if(d1=="$"&&d2=="$"&&d3=="$") {
				dinero+=50;
				System.out.println("Has ganado 50€");
			}else if(d1=="$"&&d2=="@"&&d3=="@") {
				dinero+=25;
				System.out.println("Has ganado 25€");
			}else if(d1=="$"&&d2=="#"&&d3=="#") {
				dinero+=15;
				System.out.println("Has ganado 15€");
			}else if(d1=="@"&&d2=="@"&&d3=="@") {
				dinero+=10;
				System.out.println("Has ganado 10€");
			}else if(d1=="@"&&d2=="#"&&d3=="#") {
				dinero+=5;
				System.out.println("Has ganado 5€");
			}else if(d1=="@"&&d2=="$"&&d3=="$") {
				dinero+=3;
				System.out.println("Has ganado 3€");
			}else if(d1=="#"&&d2=="#"&&d3=="#") {
				dinero+=1;
				System.out.println("Has ganado 1€");
			}else if(d1=="%"&&d2=="%"&&d3=="%") {
				dinero+=1;
				System.out.println("Has ganado 1€");
			}else if(d1=="<"&&d2=="<"&&d3=="<") {
				dinero+=1;
				System.out.println("Has ganado 1€");
			}else if(d1==">"&&d2==">"&&d3==">") {
				dinero+=1;
				System.out.println("Has ganado 1€");
			}else if(d1=="$"&&d2=="@"&&d3=="%") {
				dinero+=1;
				System.out.println("Has ganado 1€");
			}else {System.out.println("No ha habido suerte esta vez");}
			dinero--;
			System.out.println("Tienes ahora "+dinero+"€");
			
	}else if(respuesta==2){
		tirar=true;
	}
	}
	System.out.println("Tu saldo final es "+ dinero+"€");	
	}
}
