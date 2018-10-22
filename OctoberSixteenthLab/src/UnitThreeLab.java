public class UnitThreeLab {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(least(3,4,5));
        System.out.println(other(3,4,5));
    }
    public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }
    public static double least(double x, double y, double z) {
        double xyz = Math.min(Math.min(x, y), z);
        return xyz;
    }
    public static double other(double x, double y, double z) {
        double xyz1 = Math.min(Math.min(x, y), z);
        double xyz2 = Math.max(Math.max(x, y), z);
        double xyz3 = xyz1 + xyz2;
        double xyz4 = Math.sqrt(xyz3);
        return xyz4;
    }
}
