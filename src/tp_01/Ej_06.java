package tp_01;
import java.util.Scanner;

public class Ej_06 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el tamaño del arreglo: ");
	        int n = scanner.nextInt();

	        int[] arreglo = new int[n];

	        System.out.println("Ingrese los elementos del arreglo:");
	        for (int i = 0; i < n; i++) {
	            arreglo[i] = scanner.nextInt();
	        }

	      
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arreglo[j] > arreglo[j + 1]) {
	                    
	                    int temp = arreglo[j];
	                    arreglo[j] = arreglo[j + 1];
	                    arreglo[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Arreglo ordenado:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
	    }
	}

