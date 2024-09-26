import java.util.Scanner;
class Q4{
	public static void fib(int x){
			int a=0,b=1;
			System.out.print(a+","+b);
			for(int i=2;i<=x;++i){
			int temp=a+b;
				System.out.print(","+temp);
				a=b;
				b=temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		fib(n);
	}
}