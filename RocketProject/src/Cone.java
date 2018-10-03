public class Cone {
    public static final int SIZE = 6;
    public static void main(String[] args) {
        for(int j = 1; j < 6; j++) {
            for(int i = 0; i < j; i++) {
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
            System.out.println();
        }
    }
}
