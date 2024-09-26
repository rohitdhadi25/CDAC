import java.util.Scanner;
class Q2{
	private static boolean isPrime(int n)
	{
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);++i ){
			if(n%i==0) 
			{return false;}
			
		}
		return true;
	}		
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
		
	}
} 

/* class Q2 {
	private static boolean isPrime(long n)
	{
		if(n<2) return false;
		for(int x=2;x<=Math.sqrt(n);x++) { //O(n^(1/2)) time complexity
			if(n%x == 0) return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(10));
	}

} */