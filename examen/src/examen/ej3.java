package examen;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int diainicio=0;
		int mesinicio=0;
		int a�oinicio=0;
		int diafinal=0;
		int mesfinal=0;
		int a�ofinal=0;
		int dia=0;
		int diatotal=0;
		System.out.println("introduce dia mes y a�o de incio");
		diainicio= teclado.nextInt(); 
		mesinicio= teclado.nextInt();
		a�oinicio= teclado.nextInt();
		System.out.println("introduce dia mes y a�o de final");
		diafinal= teclado.nextInt();
		mesfinal= teclado.nextInt();
		a�ofinal= teclado.nextInt();
		dia=0;
		while((mesinicio!=mesfinal)&&(a�oinicio!=a�ofinal)) {
			diatotal+=dia;
			System.out.println(a�oinicio);
			System.out.println(mesinicio);
			System.out.println(diatotal);
			dia=0;
			if (mesinicio==13) {mesinicio=mesinicio-12;
								a�oinicio++;}else {
			while (mesinicio==1&&diainicio<=31) {dia++;}
			while (mesinicio==2&&a�oinicio%4==0&&dia<29) {dia++;}
			while (mesinicio==2&&a�oinicio%4!=0&&dia<28) {dia++;}
			while (mesinicio==3&&dia<31) {dia++;}
			while (mesinicio==4&&dia<30) {dia++;}
			while (mesinicio==5&&dia<31) {dia++;}
			while (mesinicio==6&&dia<30) {dia++;}
			while (mesinicio==7&&dia<31) {dia++;}
			while (mesinicio==8&&dia<31) {dia++;}
			while (mesinicio==9&&dia<30) {dia++;}
			while (mesinicio==10&&dia<31) {dia++;}
			while (mesinicio==11&&dia<30) {dia++;}
			while (mesinicio==12&&dia<31) {dia++;}
			mesinicio++;}}
		diatotal=diatotal-diainicio+diafinal;
		
		System.out.println("los dias totales son " + diatotal);
		
	}

}
