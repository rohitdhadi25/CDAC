class Q3{
	private static String removeWhiteSpace(String str){
		String astr ="";
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)!=' '){
				astr=astr+str.charAt(i);
			}
		}
		return astr;
	}
	public static void main(String[] args){
		String s=" Hello World";
		System.out.println(removeWhiteSpace(s));
		
	}
}

 
 