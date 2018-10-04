/*
	*Connor Burk
	*AP CS A
	*Period 1
	*October 3rd, 2018
	*Scaleable Rocket Project
 */
public class RocketProject {

    public static final int SIZE = 6;
    //Prints an ASCII rocket whose size can be modified by changing the final var
    public static void main(String[] args) {
        conePart();
        seperatorLine();
        topFuselage();
        seperatorLine();
        bottomFuselage();
        seperatorLine();
        conePart();
    }
    //Prints the cone pattern used at the top and bottom of the rocket
    public static void conePart() {
			for(int j = 1; j <= (SIZE * 2 - 1); j++) {
				for(int i = j; i <= (SIZE * 2 - 1); i++) {
					System.out.print(" ");
				}
				for(int i = 1; i<= j; i++) {
					System.out.print("/");
				}
				System.out.print("**");
				for(int i = 1; i <= j; i++) {
					System.out.print("\\");
				}
				System.out.println(" ");
			}
    }
    //Combines later methods so that they are called as one in the main method
    public static void topFuselage() {
        upCone();
        downCone();
    }
    //Combines methods in a different order
    public static void bottomFuselage() {
        downCone();
        upCone();
    }
    //Method for printing the upward facing pattern
    public static void upCone() {
			for(int i = 1; i <= SIZE; i++) {
				System.out.print("|");
				//This loop makes it so that the cone pattern is printed twice
				for(int b = 1; b <= 2; b++) {
					for(int j = i; j < SIZE; j++) {
						System.out.print(".");
					}
					for(int j = 1; j <= i; j++) {
						System.out.print("/\\");
					}
					for(int j = i; j < SIZE; j++) {
						System.out.print(".");
					}
				}
				System.out.println("|");
				}
			}
    //Method of printing the downward facing pattern
    public static void downCone() {
			for(int i = 0; i < SIZE; i++) {
				System.out.print("|");
				//This loop makes it so that the cone pattern is printed twice
				for(int b = 1; b <= 2; b++) {
					for(int j = 1; j <= i; j++) {
						System.out.print(".");
					}
					for(int j = i; j < SIZE; j++) {
						System.out.print("\\/");
					}
					for(int j = 1; j <= i; j++) {
						System.out.print(".");
					}
				}
				System.out.println("|");
			}
    }
    //Method for printing the seperator
    public static void seperatorLine() {
        System.out.print("+");
				//SIZE is multiplied by 2 so that it prints the '=*' enough times to fill its line
        for(int i = 1; i <= (SIZE * 2); i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
}
