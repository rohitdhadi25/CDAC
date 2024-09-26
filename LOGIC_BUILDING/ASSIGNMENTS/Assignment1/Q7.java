import java.util.Scanner;
class Q7{
	private static void repeatedString(String str){
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();++i)
		{
			for(int j=i+1;j<str.length();++j)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+"");
					break;
				}
			}
		}
		
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		repeatedString(str);
		
		
	}
}