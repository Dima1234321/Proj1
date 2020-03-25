package Pkg1;

public class Main {
    public static void main(String[] args) {
        Point x = new Point(6,6);
        double dist = x.calcDistance(new Point(70,70));
        System.out.println(dist);
    }
}
