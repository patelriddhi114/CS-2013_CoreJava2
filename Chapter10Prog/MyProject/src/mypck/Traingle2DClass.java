package mypck;

import java.awt.geom.Line2D;

public class Traingle2DClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle2D r1 = new Triangle2D(new MyPoint1(0, 0), new MyPoint1(0, 2), new MyPoint1(2, 0));

        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("Point is inside triangle: " + r1.contains(1, 1));

        System.out.println("Triangle 2 is inside this triangle: " + r1.contains( new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5)));
        System.out.println("Triangle 3 is overlaps this triangle: " + r1.overlaps(new Triangle2D(1, 1.7, -1, 1.7, 0,-3)));

	}

}

class Triangle2D {

    private MyPoint1 p1;
    private MyPoint1 p2;
    private MyPoint1 p3;

    public Triangle2D(double x1, double y1, double x2, double y2,
                      double x3, double y3) {
        this.p1 = new MyPoint1(x1, y1);
        this.p2 = new MyPoint1(x2, y2);
        this.p3 = new MyPoint1(x3, y3);
    }

    public Triangle2D(MyPoint1 p1, MyPoint1 p2, MyPoint1 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint1(0,0), new MyPoint1(1,1), new MyPoint1(2,5));
    }

    /** returns point 1 of the triangle **/
    public MyPoint1 getP1() {
        return p1;
    }

    /** sets the triangle's point 1 **/
    public void setP1(MyPoint1 p1) {
        this.p1 = p1;
    }

    /** returns point 2 of the triangle **/
    public MyPoint1 getP2() {
        return p2;
    }

    /** sets the triangle's point 2 **/

    public void setP2(MyPoint1 p2) {
        this.p2 = p2;
    }

    /** returns point 3 of the triangle **/
    public MyPoint1 getP3() {
        return p3;
    }

    /** sets the triangle's point 3 **/
    public void setP3(MyPoint1 p3) {
        this.p3 = p3;
    }

    /** returns the perimeter of the triangle. **/
    public double getPerimeter() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return s1 + s2 + s3;

    }

    /** returns the area of the triangle **/
    public double getArea() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }

    public static double calcArea(MyPoint1 p1, MyPoint1 p2, MyPoint1 p3) {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }


    /** returns true if the specified point is inside this triangle **/
    public boolean contains(MyPoint1 p) {
        return contains(p.x(), p.y);
    }

    public boolean contains(double x, double y) {

        // Get max X & Y
        double maxX = getMax(p1.x, p2.x, p3.x);
        double maxY = getMax(p1.y, p2.y, p3.y);

        // Get min X & Y
        double minX = getMin(p1.x, p2.x, p3.x);
        double minY = getMin(p1.y, p2.y, p3.y);

        // Outside the bounding rectangle of the triangle
        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        // Check if point is the border of the triangle
        MyPoint1 p = new MyPoint1(x, y);
        boolean side1 = p.onTheLineSegment(p1, p2);
        boolean side2 = p.onTheLineSegment(p1, p3);
        boolean side3 = p.onTheLineSegment(p2, p3);
        return side1 || side2 || side3;

    }

    private double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }
    private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
    
    public boolean contains(Triangle2D t) {

        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    
    public boolean overlaps(Triangle2D t) {

        MyPoint1[] pt1 = getTrianglePoints();
        MyPoint1[] pt2 = t.getTrianglePoints();

        // check is triangle side intersect
        for (int i = 0; i < 3; i++) {
            int maxI = (i+1) % 3; // max indexes

            for (int j = 0; j < 3; j++) {
                int maxJ = (j+1) % 3;
                Line2D line1 = new Line2D.Double(pt2[i].x, pt2[i].y, pt2[maxI].x, pt2[maxI].y);
                Line2D line2 = new Line2D.Double(pt1[i].x, pt1[i].y, pt1[maxJ].x, pt1[maxJ].y);
                if (line1.intersectsLine(line2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private MyPoint1[] getTrianglePoints() {

        MyPoint1[] points = new MyPoint1[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;

        return points;
    }

    /** returns true if the triangle is valid **/
    public boolean isValid() {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return  ((s1 + s2 > s3) &&
                (s1 + s3 > s2) &&
                (s3 + s2 > s1));
    }

    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

}

class MyPoint1 {

    public double x;
    public double y;

    public MyPoint1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint1() {
        this(0,0);
    }

    public double x() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double y() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint1 point) {

        return distance(point.x, point.y);
    }

    public MyPoint1 getCenterPoint(MyPoint1 p) {

        return new MyPoint1((p.x + this.x) / 2, (p.y + this.y) / 2);
    }

    public static MyPoint1 getCenterPoint(double x1, double y1, double x2, double y2) {
        return new MyPoint1((x1 + x2) / 2, (y1 + y2) / 2);
    }

    public boolean leftOfTheLine(MyPoint1 p0, MyPoint1 p1) {

        return leftOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
    }

    public boolean onTheSameLine(MyPoint1 p0, MyPoint1 p1) {

        return onTheSameLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    public boolean rightOfTheLine(MyPoint1 p0, MyPoint1 p1) {

        return rightOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    public boolean onTheLineSegment(MyPoint1 p0, MyPoint1 p1) {

        return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);

    }


    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
