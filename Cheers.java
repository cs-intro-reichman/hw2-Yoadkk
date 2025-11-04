//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int numOfCheers = Integer.parseInt(args[1]);

                name = name.toUpperCase();

                int i = 0;
                int j = 0;

                String vowelString = "AEFHILMNORSX";

                while (i < name.length()){
                        
                        char a = (name.charAt(i));
                        
                        if (vowelString.indexOf(a) != -1){
                                System.out.println("Give me an " + a + ": " + name.charAt(i) + "!");

                        }
                        else {
                                System.out.println("Give me a  " + a + ": " + name.charAt(i) + "!");
                        }
                        i++;
                }

                System.out.println("What does that spell?");

                while (j < numOfCheers){
                        System.out.println(name + "!!!");
                        j++;
                }
        }
}
