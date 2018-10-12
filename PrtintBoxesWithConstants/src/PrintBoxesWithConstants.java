public class PrintBoxesWithConstants {
    public static void main(String[] args) {
	//The first var is height, second var is width, third var is the char printed
	drawBox(4, 5, /*FIX*/);
    }
    public static void drawBox(int x, int y, /*FIX*/ z) {
        for(int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
        System.out.println();
    }
}
