import java.util.*;
class Area
{
	void CalArea(float x)
	{
	   System.out.println("Area of the square :" + x*x +" sq.unit");
	}
	void CalArea(float x , float y)
	{
	   System.out.println("Area of rectangle :"+ x*y +"sq.units");
	}
	void CalArea(double r)
	{
	   double area = 3.14*r*r;
	   System.out.println("Area of circle :"+area +"sq.units");
	}
public static void main(String[] args)
{
	int s;
	float l,b;
	double r;
	
	Area obj = new Area();
	
	Scanner a= new Scanner(System.in);
	System.out.println("Enter the side of square :");
	s=a.nextInt();
	System.out.println("Enter the length and breadth of a recatngle :");
	l=a.nextFloat();
	b=a.nextFloat();
	
	System.out.println("Enter radius of circle :");
	
	r=a.nextDouble();
	
	obj.CalArea(s);
	obj.CalArea(l ,b);
	obj.CalArea(r);
}
}
