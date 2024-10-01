class Q4{
	static String reverseString(String str){
		String rstr="";
		for(int i=str.length()-1;i>=0;i--){
			// if(str.charAt(i)!=str.charAt(str.length() - i -1)){  //basically  
					rstr=rstr+str.charAt(i);
			}
			return rstr;
		}
		
	public static void main(String[] args){
		System.out.print(reverseString("HELLO"));
	}
}