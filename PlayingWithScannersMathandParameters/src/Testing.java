import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        squirtOfSum(sumOfSquirtOfSumAndThirdVariable());
    }
    public static double y1(double z1, double z2){
        double z3 = z1 + z2;
        return Math.sqrt(z3);
    }
    public static double y2(double z1, double z2){
        return z1 + z2;
    }
    public static void squirtOfSum(){
        System.out.print("Insert first value: ");
        Scanner input1 = new Scanner(System.in);
        int x1 = input1.nextInt();
        System.out.print("\nInsert second value: ");
        Scanner input2 = new Scanner(System.in);
        int x2 = input2.nextInt();
        System.out.println("\nThe squirt of the sum is: " + y1(x1, x2));
    }
    public static void sumOfSquirtOfSumAndThirdVariable(double x1, double x2){
        System.out.print("\nInsert a third value: ");
        Scanner input3 = new Scanner(System.in);
        int x3 = input3.nextInt();
        System.out.println("\nThe sum of the squirt of your first two inputs and your third one is: " + y2(x3,y1(x1,x2)));
    }
}
