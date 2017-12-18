package Arrays;

public class Ejercicio7 {

	public int getCount(int[] values) {
		int count = 0;
		for (int current : values) {
			if (current==0) {
				count++;
			}
			
			// TODO: count the number of zeros in values
		}
		return count;
	}
	public static void main(String[] args) {
		int [] valores = {2,5,0,0,8,9};
		
		Ejercicio7 miEjemplo = new Ejercicio7();
		System.out.println(miEjemplo.getCount(valores));
	}

}
