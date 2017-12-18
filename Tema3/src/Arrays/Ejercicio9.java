package Arrays;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miVector={11,80,66,8,9};
		// Ordenación del vector
		Arrays.sort(miVector);
		// Busco un elemento en concreto en un vector ordenado
		System.out.println(Arrays.binarySearch(miVector, 6));
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));

	}

}
