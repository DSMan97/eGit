package Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures= {65,71,68,85,87,89,78};
		int [] dailyTemps=temperatures;
		dailyTemps[6]=101;
		System.out.println(temperatures[6]);
	}

}
