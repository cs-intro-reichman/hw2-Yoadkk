// Computes an approximation of PI.

public class CalcPi {
	public static void main(String [] args) { 
		int n = (Integer.parseInt(args[0]));
		double sumOfqPie = 1.0;

	

		for (double i = 1; i < n ; i++){
			


			if (i%4 == 3){
				double posNum = Math.ceil(i/4)*(i+4);
				sumOfqPie += 1/(posNum);

			}
			else if (i%4 == 1){
				double negNum = Math.ceil(i/4)*(i+2);
				sumOfqPie -= 1/(negNum);

			}
			else if (i%4 == 2){
				double posNum =  Math.ceil(i/4)*(i+3);
				sumOfqPie += 1/(posNum);

			}
			else if (i%4 == 0) {
				double negNum =  Math.ceil(i/4)*(i+5);
				sumOfqPie -= 1/(negNum);
			}

			


		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+(sumOfqPie*4));
	}
}



