
public class shirtPicker {
    public static void main(String[] args) {
        double inhalerGrandma = Math.random();
        double griffinVore = Math.random();
        double vapeGrandma = Math.random();
        double best = Math.max(inhalerGrandma, Math.max(vapeGrandma, griffinVore));
        if (best == inhalerGrandma){
            System.out.println("inhaler");
        } else if (griffinVore == best){
            System.out.println("griffin");
        } else {
            System.out.println("vape");
        }
    }
}
