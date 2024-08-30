package tp_01;
import java.util.Scanner;

public class Ej_04 {
     public static void main (String [] args) {
    	 Scanner scanner = new Scanner (System.in);
    	 
    	 System.out.print("Ingrese la base del cuadrilatero:");
    	 int base = scanner.nextInt();
    	 
    	 System.out.print ("Ingrese la altura del cuadrilatero:");
    	 int altura = scanner.nextInt();
    	 
    	 if (base <= 0 || altura <=0) {
    		 System.out.println ("La base y la altura deben ser numeros positivos.");
    		 
    	 }else {
    		 dibujarCuadrilatero(base, altura); 
         }
     }
    	 
     
     
     public static void dibujarCuadrilatero (int base, int altura) {
    	for (int i = 0; i < base; i++) {
    		System.out.print ("*");
    	}
    	
    	System.out.println("");
    	
    	for (int i = 0; i < altura - 2; i++) {
    		System.out.print("*");
    		
    		for (int j = 0; j < base - 2; j++) {
    			System.out.print(" ");
    		}
    		System.out.println("*");
    	}
    	
    	for (int i = 0; i < base; i++) {
    		System.out.print("*");
    	}
    	System.out.println("");
     
     }
}
    	 