// Computes an approximation of PI.

public class CalcPi {
	public static void main(String [] args) { 
		int n = (Integer.parseInt(args[0]));
		double sumOfqPie = 1.0;

	

		for (double i = 1; i < n ; i++){
			


			if (i%4 == 3){
				double addToSum = (1/(Math.ceil((i/4))*(7)));
				sumOfqPie -= (addToSum);

			}
			else if (i%4 == 1){
				double addToSum = (1/(Math.ceil((i/4))*(3)));
				sumOfqPie -= (addToSum);

			}
			else if (i%4 == 2){
				double addToSum =  (1/(Math.ceil((i/4))*(5)));
				sumOfqPie += (addToSum);

			}
			else if (i%4 == 0) {
				double addToSum =  (1/(Math.ceil((i/4))*(9)));
				sumOfqPie += (addToSum);
			}

			


		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+(sumOfqPie*4));
	}
}



