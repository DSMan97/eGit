package Arrays;

import java.lang.reflect.Array;

public class Ejercicio8 {

	
	public String inReverse(int[] values)
	 {
	 String message ="";
	
	for ( int i=values.length-1; i>=0;i-- ) //finish the loop header
	 {
		System.out.println(values[i]);
	 // TODO: concatenate the elements to message in reverse order
	 }
	return message;
	 }

	public static void main(String[] args) {
		int [] valores = {1,2,3,4};
		
		Ejercicio8 miEjemplo = new Ejercicio8();
		System.out.println(miEjemplo.inReverse(new 	int []{1,2,3,4}));
				
		
	}
		
	}


