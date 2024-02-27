package View;


import Controller.MDC;

import java.util.*;

public class Principal {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		MDC mdc = new MDC();
		
		boolean var = false;
		int a = 0;
		int b = 0;
		
		
		while(var == false) {
			
			System.out.print("Insira um valor inteiro positivo: ");
			a = scan.nextInt();
			System.out.print("\nInsira outro valor inteiro positivo: ");
			b = scan.nextInt();
			
			if(a < 0 || b < 0) {
				
				System.out.println("Valores inválidos");
				
				
			}
			
			else {
				var = true;
			}
			
			
		}
		
		
		
		System.out.print("Resultado: " + mdc.fMDC(a, b));
		
				
		
	}
	
	
	
	
}
