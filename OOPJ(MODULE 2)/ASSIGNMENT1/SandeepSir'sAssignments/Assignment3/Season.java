/*
spring runs from March 1 to May 31;
summer runs from June 1 to August 31;
fall (autumn) runs from September 1 to November 30; and
winter runs from December 1 to February 28 (February 29 in a leap year). 
 */

import java.util.*;
class Season
{
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
			case 12,1,2:
						System.out.println("Winter");
						break;
			case 3,4,5:
						System.out.println("Spring");
						break;
						
			case 6,7,8:
						System.out.println("Summer");
						break;
							
			case 9,10,11:
						System.out.println("Autumn");
						break;				
			
			default : System.out.println("wrong choice");
					break;
		}
	}
}