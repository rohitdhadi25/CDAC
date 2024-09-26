import java.util.Scanner;
class Q8{
	private static void nonRepeatedString(String str){
		
		for(int i=0;i<str.length();++i){
			boolean unique=true;
			for(int j=i+1;j<str.length();++j)
			{
				if(i!=j && str.charAt(i)==str.charAt(j)){
						unique=false;
						break;
				}
			}
			if(unique)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
		
	}
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		nonRepeatedString(str);
		
		
	}
}