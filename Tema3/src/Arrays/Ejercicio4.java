package Arrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] smallPrimes= {2,3,5,7,11,12};
		int [] luckyNumbers= new int[10];
		luckyNumbers= smallPrimes;
		luckyNumbers[0]=99;
		System.out.println(Arrays.toString (smallPrimes));
		System.out.println(Arrays.toString(luckyNumbers));
	}

}
