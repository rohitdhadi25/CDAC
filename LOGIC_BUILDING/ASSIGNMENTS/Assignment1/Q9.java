import java.util.Scanner;
class Q9{
	static boolean isPelindrom(int n){
		int rev=0;
		int temp=n; //it is important because after comparinga and operation we need the state of the original no.
		while(temp>0){
			rev= (rev*10)+(temp%10);
			temp=temp/10;	
		}
		return n==rev?true:false;
	
	}
	static boolean isSPelindrom(String str){
		/* int rev=0;
		int temp=n; */ //it is important because after comparinga and operation we need the state of the original no.
		for(int i=0;i<str.length()/2;++i){
			if(str.charAt(i)!=str.charAt(str.length() - i -1))
			{
				return false;
			}				
			
		}
		return true;
	}	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 /* System.out.println(isPelindrom()); */
		 System.out.println(isSPelindrom("----01210----"));
		
	}
}