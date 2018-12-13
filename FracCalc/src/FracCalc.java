import java.util.Scanner;
import java.util.Arrays;

public class FracCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter three tokens: ");
        String fullInput = userInput.nextLine();
        while (!fullInput.equals("quit")) {
            //
            String[] terms = new String[3];
            int x = -1;
            //n is used to represent the amount of words we've found
            int n = 0;
            for (int i = 0; i < fullInput.length(); i++) {
                x++;
                if (fullInput.charAt(i) == ' ') {
                    //If the part of the string that we're accessing is a space
                    System.out.println(fullInput.substring(i - x, i));
                    terms[n] = fullInput.substring(i - x, i);
                    x = -1;
                    n++;
                    //Word count increases
                }
                //Once the first two words are found we can print out the rest of the string
                if (n == 2) {
                    System.out.println(fullInput.substring(i + 1));
                    terms[n] = fullInput.substring(i + 1);
                    n++;
                }
            }

            //System.out.println(Arrays.toString(terms));
            System.out.print("Please input: ");
            fullInput = userInput.nextLine();
        }
    }
    public static int parseWhole(String fullNumber) {
        for (int i = 0; i < fullNumber.length(); i++) {
            if (fullNumber.charAt(i) == '_') {
                return Integer.parseInt(fullNumber.substring(0, i));
            }
        }
        return 0;
    }

}