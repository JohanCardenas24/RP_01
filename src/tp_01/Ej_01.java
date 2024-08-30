package tp_01;
/*Escriba un algoritmo que, dados tres números, nos indique cual es el mayor, 
 *el menor y el del medio utilizando condicionales  
 */


public class Ej_01 {

	public static void main(String[] args) {
	
        int num1 = 25;
        int num2 = 5; 
        int num3 = 15;
        
        int numeroMayor, numeroMenor, numeroMedio;

        
        if (num1 >= num2 && num1 >= num3) {
            numeroMayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numeroMayor = num2;
        } else {
            numeroMayor = num3;
        }

        
        if (num1 <= num2 && num1 <= num3) {
            numeroMenor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            numeroMenor = num2;
        } else {
            numeroMenor = num3;
        }

        
        numeroMedio = num1 + num2 + num3 - numeroMayor - numeroMenor;

        
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        System.out.println("El número medio es: " + numeroMedio);
    }
}