import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class FracCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter three terms (mixed numbers in the format of a_b/c) or type 'quit' to exit: ");
        String fullInput = userInput.nextLine();
        while (!fullInput.equals("quit")) {
            String[] terms = new String[3];
            int x = -1;
            //n is used to represent the amount of words we've found
            int n = 0;
            for (int i = 0; i < fullInput.length(); i++) {
                x++;
                if (fullInput.charAt(i) == ' ') {
                    //If the part of the string that we're accessing is a space
                    terms[n] = fullInput.substring(i - x, i);
                    x = -1;
                    n++;
                    //Word count increases
                }
                //Once the first two words are found we can print out the rest of the string
                if (n == 2) {
                    terms[n] = fullInput.substring(i + 1);
                    n++;
                }
            }
            //New variables used to redefine the numerator in the case of a mixed number
            double newNumeratorOne = parseWhole(terms[0]) * parseDenominator(terms[0]) + parseNumerator(terms[0]);
            double newNumeratorTwo = parseWhole(terms[2]) * parseDenominator(terms[2]) + parseNumerator(terms[2]);
            //Variables used to perform the operations by multiplying some terms together
            double AD = newNumeratorOne * parseDenominator(terms[2]);
            double BC = parseDenominator(terms[0]) * newNumeratorTwo;
            double BD = parseDenominator(terms[0]) * parseDenominator(terms[2]);
            double AC = newNumeratorOne * newNumeratorTwo;
            double ADplusBC = AD + BC;
            double ADminusBC = AD - BC;

            //Battery of if statements that check the operator stored in terms[] and use the previous set of variables
            //differently depending on what th operator is
            if (terms[1].equals("+")){
                System.out.println(ADplusBC / BD);
            }
            if (terms[1].equals("-")){
                System.out.println(ADminusBC / BD);
            }
            if (terms[1].equals("*")){
                System.out.println(AC / BD);
            }
            if (terms[1].equals("/")){
                System.out.println(AD / BC);
            }

            //Sentinel
            System.out.print("Please enter three tokens or type 'quit' to exit: ");
            fullInput = userInput.nextLine();
        }
    }
    public static int parseWhole(String fullNumber) {
        int j = 0;
        for (int i = 0; i < fullNumber.length(); i++) {
            if (fullNumber.charAt(i) == '_') {
                return Integer.parseInt(fullNumber.substring(0, i));
            } else if(fullNumber.charAt(i) == '/') {
                j++;
            }
        }
        if(j == 0){
            return Integer.parseInt(fullNumber);
        }
        return 0;
    }
    public static int parseNumerator(String fullNumber){
        int i = 0;
        int j = 0;
        for (int n = 0; n < fullNumber.length(); n++){
            if (fullNumber.charAt(n) == '_'){
                j = n;
                i++;
            }
            if (fullNumber.charAt(n) == '/' && i == 1){
                return Integer.parseInt(fullNumber.substring(j + 1, n));
            }
            if (fullNumber.charAt(n) == '/' && i == 0){
                return Integer.parseInt(fullNumber.substring(j, n));
            }
        }
        return 0;
    }
    public static int parseDenominator(String fullNumber){
        int i = 0;
        int j = 0;
        for (int n = 0; n < fullNumber.length(); n++){
            if (fullNumber.charAt(n) == '_'){
                i++;
            }
            if (fullNumber.charAt(n) == '/'){
                j++;
                return Integer.parseInt(fullNumber.substring(n + 1));
            }
            if (i == 1 && j == 1){
                return 1;
            }
        }
        return 1;
    }
}