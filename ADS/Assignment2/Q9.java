class Q9{
	static boolean isStringPalindrom(String str){
		for(int i=0;i<str.length()/2;++i){
			for(int j=i+1;j<str.length();++j){
				if(str.charAt(i)!=str.charAt(str.length()-i-1)){
					return false;
				}
				
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(isStringPalindrom("RADAR"));
	}
}