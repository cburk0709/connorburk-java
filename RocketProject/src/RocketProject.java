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
        for(int i = 0; i < SIZE; i++) {
            System.out.print(" ");
        }
        for(int i = 0; SIZE > i; i++) {
            System.out.print("/");
        }
        System.out.print("**");
        for(int i = 0; SIZE > i; i++) {
            System.out.print("\\");
        }
        for(int i = 0; i < SIZE; i++) {
            System.out.print(" ");
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

    }
    //Method of printing the downward facing pattern
    public static void downCone() {

    }
    //Method for printing the seperator
    public static void seperatorLine() {
        System.out.print("+");
        for(int i = 1; i <= SIZE; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
}
