package Pkg1;

public class Main {
    public static void main(String[] args) {
        Point x = new Point(3,3);
        double dist = x.calcDistance(new Point(10,20));
        System.out.println(dist);
    }
}
