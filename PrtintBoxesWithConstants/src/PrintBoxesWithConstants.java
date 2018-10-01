public class PrintBoxesWithConstants {
    public static final int WIDTH = 4;
    public static final int HEIGHT = 4;

    public static void main(String[] args) {
        splat();
        dollarSign();
        octothorpe();
    }

    public static void splat() {
        for(int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dollarSign() {
        for(int i = 1; i <= HEIGHT; i++) {
            for(int j = 1; j<= WIDTH; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void octothorpe() {
        for(int i = 1; i <= HEIGHT; i++) {
            for(int j = 1; j <= WIDTH; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}
