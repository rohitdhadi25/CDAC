import java.util.*;
class Q1{
	private static Scanner sc=new Scanner(System.in);
	public static double ArmstrongNumber(int n,int count){
		int res=0;
		while(n>0){
				int rem=n%10;
				double ans=0;
				ans=Math.pow(rem,count);
				n=n/10;
				res+=ans;
		}
		/* if(n==res)
		{
			return true;
		}
		else
		{
			return false;
		} */
		return res;
		
		
	}
	public static void main(String[] args)
	{
		
			int n=sc.nextInt();
			int count =0;
			while (n>0){
			n=n/10;
			count++;
		} 
		
		if(ArmstrongNumber(n,count)==n)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		/* System.out.println(result); */
	}
}