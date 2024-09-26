import java.util.Scanner;
class Q6{
	public static void sqrt(int x){
		for(int i=1;i*i<x;++i)
		{
			if(i*i<x)
			{
				System.out.println(i);
			}
			
		}
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 sqrt(a);
	}
}
