import java.util.Scanner;
public class DistanceProjectExtraCredit {
    public static void main(String[] args) {
        Scanner GridInput = new Scanner(System.in);
        System.out.print("Enter first coordinate: ");
        String mgrs1 = GridInput.next();
        System.out.print("\nEnter second coordinate: ");
        String mgrs2 = GridInput.next();
       // distance(mgrs1, mgrs2);
    }
    public static String distance(String x1, String x2){
        //MGRS goes from index 0 - 12
        //Index 0 - 4 is inconsequential for now
        //Index 5 - 8 is our x
        //Index 9 - 12 is our y

    }
}
