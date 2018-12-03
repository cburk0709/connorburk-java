import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class RollDice {
    public static final int DICENUM = 1;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Would you like to play a game? (y/n) -- ");
        String gameState = userInput.next();
        defineDice();
        while(gameState.equals("y")){
            rollDice();
            printDice();
            drawLine();
            System.out.print("Would you like to play again? (y/n) -- ");
            gameState = userInput.next();
        }
    }

    public static void defineDice(){
        String diceAppearance[][] = new String[6][5];
        String diceAmount[][] = new String[DICENUM][5];
    }

    public static void printDice(){
        System.out.println("printDice");
    }

    public static int rollDice(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void drawLine(){
        System.out.println("-------------------");
    }
}
