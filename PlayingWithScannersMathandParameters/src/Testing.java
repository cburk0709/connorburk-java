import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        System.out.print("Insert first value: ");
        Scanner input1 = new Scanner(System.in);
        int x1 = input1.nextInt();
        System.out.println();
        System.out.print("Insert second value: ");
        Scanner input2 = new Scanner(System.in);
        int x2 = input2.nextInt();
        System.out.println("\nThe squirt of the sum is: " + y1(x1, x2));
    }
    public static double y1(double z1, double z2){
        double z3 = z1 + z2;
        return Math.sqrt(z3);
    }
}
