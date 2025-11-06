// Computes an approximation of PI.

public class CalcPi {
	public static void main(String [] args) { 

		int n = Integer.parseInt(args[0]);
		double sumOfqPie = 1.0;

	

		for (double i = 1; i < n ; i = i+ 2){
			


			if (i%4 == 3){
				double posNum = (i+2);
				sumOfqPie += 1/(posNum);

			}
			if (i%4 != 3){
				double negNum = (i+2);
				sumOfqPie -= 1/(negNum);

			}
			


		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:	"+(sumOfqPie*4));
	}
}



