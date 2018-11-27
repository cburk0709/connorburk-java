/*
Connor Burk
AP CS A
Period 1
November 14, 2018
Rock Paper Scissors Project
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Would you like to play rock paper scissors? (y/n)");
        String gameAnswer = input.next();
        while(gameAnswer.equals("y")) {
            System.out.println("How many rounds?");
            int roundCount = input.nextInt();
            System.out.print("What is your name? - ");
            String playerName = input.next();
            for(int i = 1; i <= roundCount; i++){
                System.out.println("ROUND " + i);
                int weaponAnswerInt = weaponStringToInt();
                int computerWeapon = rand.nextInt(3);
                if (computerWeapon == weaponAnswerInt) {
                    System.out.println("It's a tie!\n");
                } else if (computerWeapon == 0 && weaponAnswerInt == 2) {
                    System.out.println("The machine chose ROCK, beating " + playerName + "'s SCISSORS\n");
                } else if (computerWeapon == 0 && weaponAnswerInt == 1) {
                    System.out.println("The machine chose ROCK, losing to " + playerName + "'s PAPER\n");
                } else if (computerWeapon == 1 && weaponAnswerInt == 0) {
                    System.out.println("The machine chose PAPER, beating " + playerName + "'s ROCK\n");
                } else if (computerWeapon == 1 && weaponAnswerInt == 2) {
                    System.out.println("The machine chose PAPER, losing to " + playerName + "'s SCISSORS\n");
                } else if (computerWeapon == 2 && weaponAnswerInt == 1) {
                    System.out.println("The machine chose SCISSORS, beating " + playerName + "'s PAPER\n");
                } else if (computerWeapon == 2 && weaponAnswerInt == 0) {
                    System.out.println("The machine chose SCISSORS, losing to " + playerName + "'s ROCK\n");
                } else if (weaponAnswerInt == 3){
                    System.out.println("Please choose a weapon");
                }
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
}
