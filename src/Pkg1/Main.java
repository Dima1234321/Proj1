package Pkg1;

public class Main {
    public static void main(String[] args) {
        Point x = new Point(30,30);
        double dist = x.calcDistance(new Point(10,20));
        System.out.println(dist);
    }
}
