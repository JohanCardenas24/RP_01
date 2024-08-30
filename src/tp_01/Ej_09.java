package tp_01;

public class Ej_09 {
	    public static void main(String[] args) {
	        int[] arreglo = {1, 2, 3, 4, 5};
	        int k = 2;

	        
	        System.out.println("Arreglo original: ");
	        imprimirArreglo(arreglo);

	        
	        for (int i = 0; i < k; i++) {
	            rotarUnaVez(arreglo);
	        }

	        
	        System.out.println("Arreglo rotado: ");
	        imprimirArreglo(arreglo);
	    }

	    
	    public static void rotarUnaVez(int[] arreglo) {
	        int ultimoElemento = arreglo[arreglo.length - 1];
	        for (int i = arreglo.length - 1; i > 0; i--) {
	            arreglo[i] = arreglo[i - 1];
	        }
	        arreglo[0] = ultimoElemento;
	    }

	    
	    public static void imprimirArreglo(int[] arreglo) {
	        for (int num : arreglo) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

