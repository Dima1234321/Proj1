package Pkg1;
import java.lang.Math;

public class Point {
    int x, y;
    public Point() {
        x = y = 0;
    }
    public Point(int x) {
        super();
        this.x = x;
    }
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public double calcDistance(Point p){
        double x = Math.pow( Double.valueOf(p.x - this.x), Double.valueOf(2));
        double y = Math.pow( Double.valueOf(p.y - this.y), Double.valueOf(2));
        return Math.sqrt( x + y );
    }
}
