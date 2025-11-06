// Computes an approximation of PI.

public class CalcPi {
	public static void main(String [] args) { 

		int n = Integer.parseInt(args[0]);
		double sumOfqPie = 1.0;
		int counter = 0;

		for (int i = 3; i < n ; i++){
			if (i%2 != 0){
				if (counter%2 == 0){
					sumOfqPie -= 1/(double)i;
					counter++;
				}
				else{
					sumOfqPie += 1/(double)i;
					counter++;
				}
			}

			System.out.println(i);
		}
		
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+(sumOfqPie*4.0));
		

	}
}



