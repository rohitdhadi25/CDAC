class Q1{
	private static void star(int n){
		for(int i=1;i<=n;++i){
			for(int j=1;j<=i;++j){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String... args){
		star(5);
	}
}