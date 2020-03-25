package Pkg1;

public class Main {
    public static void main(String[] args) {
        Point x = new Point(7,7);
        double dist = x.calcDistance(new Point(80,80));
        System.out.println(dist);
    }
}
