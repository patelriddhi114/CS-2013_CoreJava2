package mypck;

public class MyPointClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(0,0);
		MyPoint b = new MyPoint(10,30.5);
		
		System.out.printf("The distance between the points \n" + a + "\n and " + b + " is " + b.distance(a) + "\n");
	}

}
class MyPoint
{
	public double x;
	public double y;
	
	public MyPoint(double x,double y)
	{
		this.x = x;
		this.y=y;
	}
	public MyPoint()
	{
		this(0,0);
	}
	
	public double distance(double x,double y)
	{
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
	public double distance(MyPoint other)
	{
		return other.distance(this.x, this.y);
	}
	public double  distance()
	{
		return this.distance(0.0, 0.0);
	}
	
	public String repr()
	{
		return String.format("MyPoint(%f,%f)", this.x,this.y);
	}
	
	
	
	
}