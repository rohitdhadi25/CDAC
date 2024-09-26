import java.util.Scanner;
class Q3{
	private static int fact(int n){
			int fact=1;
			for(int i=n;i>=1;--i)
				fact*=i;
			return fact;
	}	
	public static void main(String... args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
}