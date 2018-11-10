package mypck;

public class Rectangle2DClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
	    System.out.println("Area is " + r1.getArea());
	    System.out.println("Perimeter is " + r1.getPerimeter());
	    System.out.println(r1.contains(3, 3));
	    System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
	    System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 6.7)));
	}

}
class MyRectangle2D
{
    private double x;
    private double y;
    private double height;
    private double width;

    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public MyRectangle2D()
    {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }
    public MyRectangle2D(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea()
    {
        return width * height;
    }
    public double getPerimeter()
    {
        return (width * 2) + (height * 2);
    }
    public boolean contains(double x, double y)
    {
        return (2 * Math.abs((x-this.x)) > height || 2 * Math.abs((y - this.y)) > width);
    }
    public boolean contains(MyRectangle2D r)
    {
        return (2 * Math.abs((r.getX()-this.x)) > height || 2 * Math.abs((r.getY() - this.y)) > width);
    }
    public boolean overlaps(MyRectangle2D r)
    {
        return (2 * Math.abs((r.getX()-this.x)) >= height || 2 * Math.abs((r.getY() - this.y)) >= width);
    }
}