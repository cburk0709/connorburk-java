import java.util.Arrays;
import java.util.Scanner;

public class WorksheetFourPointOne {
    public static void main(String[] args) {
        //Exercise 1.
        int[] arrayOne = new int[8];

        //Exercise 2a.
        arrayOne[0] = 10;
        arrayOne[1] = 9;
        arrayOne[2] = 8;
        arrayOne[3] = 7;
        arrayOne[4] = 6;
        arrayOne[5] = 5;
        arrayOne[6] = 4;
        arrayOne[7] = 3;
        arrayOne[8] = 2;

        //Exercise 2b.
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = 2;
        }

        //Exercise 2c.
        int[] arrayTwo = new int[5];
        for(int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = i + 1;
        }

        //Exercise 2d.
        int[] arrayThree = new int[3];
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < arrayThree.length; i++){
            System.out.print("Value at index " + i + " -- ");
            arrayThree[i] = userInput.nextInt();
            System.out.println();
        }

        //Exercise 2e.
        int[] arrayFout = {-4, 19, 3, 20, 72, 58};

        //Exercise 3a.
        System.out.println("\n" + arrayThree[arrayThree.length - 1]);

        //Exercise 3b.
        int max = Math.max(arrayThree[0], Math.max(arrayThree[1], arrayThree[2]));
        int min = Math.min(arrayThree[0], Math.min(arrayThree[1], arrayThree[2]));
        if (arrayThree[0] == max || arrayThree[0] == min){
            System.out.println(arrayThree[0]);
        } else if (arrayThree[1] == max || arrayThree[1] == min){
            System.out.println(arrayThree[1]);
        } else {
            System.out.println(arrayThree[2]);
        }
        //Exercise 3c.
        for(int i = 0; i < arrayThree.length; i++){
            arrayThree[i] -= 1;
        }

        //Exercise 3d.
        int[] even = new int[499];
        for(int i = 0; i <= even.length; i++){
            even[i] = i;
        }

        //Exercise 3f.
        System.out.println(even[100]);

        //Exercise 3g.
        System.out.println(even[278] + " " + even[456]);

        //Exercise 3h.
        int[] negativeFourToPositiveFive = new int[10];
        for (int x = 0; x <= negativeFourToPositiveFive.length; x++){
            for (int i = -4; i <= 5; i++){
                negativeFourToPositiveFive[x] = i;
            }
        }

        //Exercise 3i.
        int[] exampleArray = new int[10];
        for (int x = 0; x <= exampleArray.length; x++){
            for (int i = exampleArray[0]; i <= exampleArray[exampleArray.length - 1]; i++){
                exampleArray[x] = i;
            }
        }
    }
}
