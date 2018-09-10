public class DrawBoxes {
    public static void main(String[] args) {
        for (int i=0; i<4; i++) {
            drawBoxes();
        }
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
