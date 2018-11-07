import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Would you like to play rock paper scissors? (y/n)");
        String gameAnswer = input.next();
        System.out.println("How many rounds?");
        int roundCount = input.nextInt();
        System.out.print("What is your name? - ");
        String playerName = input.next();
        while(gameAnswer.equals("y")) {
            for(int i = 1; i <= roundCount; i++){
                System.out.println("ROUND " + i);
                int weaponAnswerInt = weaponStringToInt();
                int computerWeapon = rand.nextInt(3);
                playGame(computerWeapon, weaponAnswerInt, playerName);
            }
            System.out.println("Would you like to play again? (y/n)");
            gameAnswer = input.next();
        }
    }
    public static int weaponStringToInt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pick your weapon: ROCK, PAPER, or SCISSORS - ");
        String weaponAnswer = input.next();
        if (weaponAnswer.equals("ROCK")) {
            return 0;
        } else if (weaponAnswer.equals("PAPER")) {
            return 1;
        } else if (weaponAnswer.equals("SCISSORS")){
            return 2;
        } else {
            return 3;
        }
    }
    public static void playGame(int computerWeapon1, int weaponAnswerInt1, String playerName1){
        if (computerWeapon1 == weaponAnswerInt1) {
            System.out.println("It's a tie!\n");
        } else if (computerWeapon1 == 0 && weaponAnswerInt1 == 2) {
            System.out.println("The machine chose ROCK, beating " + playerName1 + "'s SCISSORS\n");
        } else if (computerWeapon1 == 0 && weaponAnswerInt1 == 1) {
            System.out.println("The machine chose ROCK, losing to " + playerName1 + "'s PAPER\n");
        } else if (computerWeapon1 == 1 && weaponAnswerInt1 == 0) {
            System.out.println("The machine chose PAPER, beating " + playerName1 + "'s ROCK\n");
        } else if (computerWeapon1 == 1 && weaponAnswerInt1 == 2) {
            System.out.println("The machine chose PAPER, losing to " + playerName1 + "'s SCISSORS\n");
        } else if (computerWeapon1 == 2 && weaponAnswerInt1 == 1) {
            System.out.println("The machine chose SCISSORS, beating " + playerName1 + "'s PAPER\n");
        } else if (computerWeapon1 == 2 && weaponAnswerInt1 == 0) {
            System.out.println("The machine chose SCISSORS, losing to " + playerName1 + "'s ROCK\n");
        } else if (weaponAnswerInt1 == 3){
            System.out.println("Please choose a weapon");
        }
    }
}
