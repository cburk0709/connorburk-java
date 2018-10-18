/*
Connor Burk
AP CS A
October 18, 2018
Distance Project
 */
public class DistanceProject {
    public static void main(String[] args) {
        double d1 = distance(16,10,4,28);
        System.out.println("The distance is " + d1 + " to Gig Harbor from Tacoma");
        //Tacoma to Gig Harbor
        double d2 = distance(4, 28, 2, 8);
        double s1 = d2 + d1;
        System.out.println("The distance is " + s1 + " to Steilacoom from Tacoma when you pass through Gig Harbor");
        //Gig Harbor to Steilacoom
        double d3 = distance(2, 8, 16, 10);
        double s2 = s1 + d3;
        System.out.println("The distance is is " + s2 + " to go round trip");
        //Steilacoom back to Tacoma
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        //Does the subtraction inside the parentheses
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        //Squares the difference of the coordinates
        double xy = x4 + y4;
        //Adds the squares
        double d = Math.sqrt(xy);
        //Finds the square root of the sum of the squares
        return d;
    }
}