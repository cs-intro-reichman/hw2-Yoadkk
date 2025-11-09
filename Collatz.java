// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		
		int n = Integer.parseInt(args[0]);
		String commType = args[1];

		switch (commType) {
			case "v":
			for (int i = 1 ; i < n+1 ; i++){
			System.out.print(i);

			int hailstone = i;
			
			for (int j = 1 ; j <= n+100 ; j++){

				if (hailstone%2 == 0){
					hailstone = hailstone/2;
					System.out.print(" "+hailstone);
					if (hailstone == 1 ){
						System.out.print(" ("+(1+j)+")");
						break;
					}
					
				}


				else if (hailstone%2 != 0){
					hailstone = hailstone*3 + 1;
					System.out.print(" "+hailstone);

				}




			}
			System.out.println("");
			if (i == n){
				System.out.println("Every one of the first "+ n +" hailstone sequences reached 1.");
			}
		}
				
				break;
			case "c":
			for (int i = 1 ; i < n+1 ; i++){

			int hailstone = i;
			
			for (int j = 1 ; j <= n+10000 ; j++){

				if (hailstone%2 == 0){
					hailstone = hailstone/2;
					if (hailstone == 1 ){
						break;
					}
					
				}


				else if (hailstone%2 != 0){
					hailstone = hailstone*3 + 1;

				}




			}
			if (i == n){
				System.out.println("Every one of the first "+ n +" hailstone sequences reached 1.");
			}
		}


				break;
			default:
				System.out.println("This string is incompeteble");
		}
	}
}
