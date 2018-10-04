public class Cone {
    public static final int SIZE = 9;
    public static void main(String[] args) {
        for(int j = 1; j <= (SIZE * 2 - 1); j++) {
					for(int i = j; i <= (SIZE * 2 -1); i++) {
						System.out.print(" ");
					}
					for(int i = 1; i <= j; i++) {
						System.out.print("/");
					}
					System.out.print("**");
					for(int i = 1; i <= j; i++) {
						System.out.print("\\");
					}
					System.out.println(" ");
				}
		}
}
