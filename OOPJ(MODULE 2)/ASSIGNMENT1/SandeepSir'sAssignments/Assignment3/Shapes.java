import java.util.*;
class Shapes
{
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("CHOOSE ONE OPTION \1 1 is for Circle, \2 2 is for Square, \3 3 is for Rectangle, \4 4is for Triangle");
		int ch = s.nextInt();
		switch(ch)
		{
			case 1: Scanner s1 = new Scanner(System.in);
					System.out.print("Enter Radius: ");
					double radius=s.nextDouble();
					double Ca= 3.14f*(radius*radius);
					System.out.println("area of circle: "+Ca);
					break;
					
			case 2: Scanner s2 = new Scanner(System.in);
					System.out.print("Enter Side: ");
					double side=s.nextDouble();
					double Sa= side*side;
					System.out.println("area of Square: "+Sa);
					break;
			
			case 3:	Scanner s3 = new Scanner(System.in);
					System.out.print("Enter length: ");
					double length=s.nextDouble();
					System.out.print("Enter width: ");
					double width=s.nextDouble();
					double Ra=(length*width);
					System.out.println("area of Rectangle: "+Ra);
					break;
			case 4:	Scanner s4 = new Scanner(System.in);
					System.out.print("Enter base: ");
					double base=s.nextDouble();
					System.out.print("Enter height: ");
					double height=s.nextDouble();
					double Ta= 0.5f*(base*height);
					System.out.println("area of Triangle: "+Ta);
					break;
			default:	
					System.out.println("wrong input");
					break;		
		}
		
		
	}
}