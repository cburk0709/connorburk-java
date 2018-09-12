public class DrawBoxes {
    public static void main(String[] args) {
	System.out.println("Three boxes");

        for (int i=0; i<3; i++) {
            drawBoxes();
	   
        }

        System.out.println();
	System.out.println("Complete.");
    }
    public static void drawBoxes() {
        System.out.println();
        drawTop();
        drawSides();
        drawSides();
        drawTop();

    }
    public static void drawTop() {
        System.out.println("+-----+");
    }
    public static void drawSides() {
        System.out.println("|     |");
    }
}
