import java.util.Scanner;

public class FracCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter three tokens: ");
        String fullInput = userInput.nextLine();
        while (!fullInput.equals("quit")){
            String word = "";
            for (int j = 1; j <= 3; j++){
                for (int i = 0; i < fullInput.length(); i++){
                    if (fullInput.charAt(i) != ' '){
                        word += word + fullInput.charAt(i);
                    } else {
                    }
                }
                System.out.println(word);
            }
            System.out.print("Please input: ");
            fullInput = userInput.nextLine();
        }
    }
}
