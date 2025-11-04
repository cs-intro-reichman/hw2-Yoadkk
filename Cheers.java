//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int numOfCheers = Integer.parseInt(args[1]);

                int i = 0;
                int j = 0;

                String vowelString = "{AEFHILMNORSXaefhilmnorsx";

                while (i < name.length()){
                        
                        char a = name.charAt(i);
                        
                        if (vowelString.indexOf(a) != -1){
                                System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");

                        }
                        else {
                                System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!");
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
