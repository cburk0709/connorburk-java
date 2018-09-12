/*
Connor Burk
AP CS A
September 12th 2018
Six days of Xmas project
 */
public class SixDaysOfXmas {
    public static void main(String[] args) {
        firstDay();
        secondDay();
        thirdDay();
        fourthDay();
        fifthDay();
        sixthDay();
    }

    //first set of methods defining days called in main

    public static void firstDay() {
        System.out.println("On the first day of \"Xmas\" my true love gave to me");
        firstGift();
    }
    public static void secondDay() {
        System.out.println("On the second day of \"Xmas\" my true love gave to me");
        secondGift();
    }
    public static void thirdDay() {
        System.out.println("On the third day of \"Xmas\" my true love gave to me");
        thirdGift();
    }
    public static void fourthDay() {
        System.out.println("On rhe fourth day of \"Xmas\" my true love gave to me");
        fourthGift();
    }
    public static void fifthDay() {
        System.out.println("On the fifth day of \"Xmas\" my true love gave to me");
        fifthGift();
    }
    public static void sixthDay() {
        System.out.println("On the sixth day of \"Xmas\" my true love gave to me");
        sixthGift();
    }

    //second set of methods defing the gifts called in the day method

    public static void firstGift() {
        System.out.println("a partridge in a pear tree\n");
    }
    public static void secondGift() {
        System.out.println("two turtle doves, and");
        firstGift();
    }
    public static void thirdGift() {
        System.out.println("three French hens,");
        secondGift();
    }
    public static void fourthGift() {
        System.out.println("four calling birds,");
        thirdGift();
    }
    public static void fifthGift() {
        System.out.println("five golden rings,");
        fourthGift();
    }
    public  static void sixthGift() {
        System.out.println("six geese-a-laying,");
        fifthGift();
    }
}
