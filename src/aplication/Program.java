package aplication;

import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá Mundo!");
		System.out.println("Este é um programa/brincadeira a fins de teste");
		System.out.println("MEGA SENA PALPITE!");
		System.out.println("Digite 6 numeros de 1 a 60: (a cada n. aperte ENTER)");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		
		Date data = new Date();
		
		
		
		int nu1 = n6 + 6;
		if (nu1 > 60) {
			
			n1 = 6;
		}
		
		int nu2 = n5 + 13;
		if (nu2 > 60) {
			
			n2 = 13;
		}
		
		int nu3 = n4 + 17;
		if (nu3 > 60) {
			
			n3 = 17;
		}
		
		int nu4 = n3 + 25;
		if (nu4 > 60) {
			
			n4 = 25;
		}
		
		int nu5 = n2 + 12;
		if (nu5 > 60) {
			
			n5 = 57;
		}
		
		int nu6 = n1 + 11;
		if (nu6 > 60) {
			
			n6 = 60;
		}
		
		System.out.println();
		System.out.println("Sugestão de hoje "+data+" BOA SORTE!");
		System.out.println(nu1+"-"+nu2+"-"+nu3+"-"+nu4+"-"+nu5+"-"+nu6);
		
		
		
		sc.close();
	}

}
