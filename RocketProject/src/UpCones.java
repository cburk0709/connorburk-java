public class UpCones {
	public static final int SIZE = 3;
	public static void main(String[] args) {
		for(int i = 1; i <= SIZE; i++) {
			System.out.print("|");
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
}
