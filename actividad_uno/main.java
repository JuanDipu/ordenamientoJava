package actividad_uno;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el tamaño del array");
		int dato= leer.nextInt();
		int array[]=llenarArrayAleatorio(0,100,dato);
		int array1[]=array;
		AppOrdenar obj1= new AppOrdenar();
		System.out.println("Array sin Ordenar");
		System.out.println(Arrays.toString(array));
		obj1.seleccion(array);
		System.out.println("Array Ordenado algortimo de selección");
		System.out.println(Arrays.toString(array));
		obj1.burbujaSimple(array1);
		System.out.println("Array Ordenado algortimo de intercambio directo");
		System.out.println(Arrays.toString(array1));

	}
	   public static int[] llenarArrayAleatorio(int desde, int hasta, int tam) {
	        int[] numeros = new int[tam];
	        Random rnd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
	        }
	        return numeros;
	    }
}

