package mypck;

public class Circle2DClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area" + c1.getArea());
		System.out.println("Perimeter" + c1.getPerimeter());
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
class Circle2D
{
	double x,y;
	double radius;
	
	public Circle2D(double x1,double y1,double radius1)
	{
		this.x = x1;
		this.y = y1;
		this.radius = radius1;
	}
	
	public Circle2D()
	{
		x =0;;
		y= 0;
		radius =1;
	}
	public double getX()
	{
		return x;
	}
	public void setX(double x1)
	{
		this.x = x1;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y1)
	{
		this.y = y1;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius1)
	{
		this.radius = radius1;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	public boolean contains(double x, double y) 
	{
		double distance = Math.pow(getX() - x, 2.0) + Math.pow(getY() - y,2.0);
		if (distance <= radius)
			return true;
		else
			return false;
	}

	public boolean contains(Circle2D circle) 
	{
		double distance = Math.sqrt(Math.pow(circle.x - getX(), 2.0) +Math.pow(circle.y - getY(), 2.0));
		if (distance <= Math.abs(radius - circle.radius))
			return true;
		else
			return false;

	}

	public boolean overlaps(Circle2D circle) 
	{
		double distance = Math.sqrt(Math.pow(circle.x - getX(), 2.0) +Math.pow(circle.y - getY(), 2.0));
		if (distance > Math.abs(radius - circle.radius) && distance <Math.abs(radius + circle.radius))
			return true;
		else
			return false;
	}
}