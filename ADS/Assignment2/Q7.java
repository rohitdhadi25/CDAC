class Q7{
	static void reverseNumberLevel2(String str,int count){
		if(count==1){
			System.out.print("-");
		}
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args){
		int n=9876;
		int count=0;
		if(n<0){
			count++;
		}
		String str=String.valueOf(n);
		reverseNumberLevel2("9876-",count);
	}
	
}