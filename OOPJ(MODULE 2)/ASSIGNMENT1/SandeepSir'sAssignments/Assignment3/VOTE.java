import java.util.*;
class VOTE
{
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		if(v <= 18)
		{
			System.out.println("not eligible for Vote");
			
		}
		else
		{
			System.out.println("eligible for Vote");
		}
		
	}
}