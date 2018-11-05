public class QuadrantLab {
    public static void main(String[] args) {
        double x = 0;
        double y = -2;
        System.out.println("Your coordinates are in quadrant " + getQuadrant(x,y));
    }
    public static int getQuadrant(double x, double y){
        if(x < 0 && y > 0){
            return 2;
        }
        else if(x < 0 && y < 0){
            return 3;
        }
        else if(x > 0 && y < 0){
            return 4;
        }
        else if(x > 0 && y > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
