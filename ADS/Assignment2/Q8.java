class Q8{
	
	static long arrayManipulation(int n,int[][] queries){
		long[] res=new long[n];
		long Max=Integer.MIN_VALUE;
		for(int i=0;i<n;++i){
			int s=queries[i][0]-1; //for one base index
			int e=queries[i][1]-1;
			int add=queries[i][2];
			res[s]+=add;
			if(e+1<n)
			{
				res[e+1]-=add;
			}
		}
		for(int i=1;i<n;++i){
			res[i]+=res[i-1];
			Max=Math.max(Max,res[i]);
		}
		return Max;
	}
	public static void main(String[] args){
		int arr[][] =new int[][]{{1, 2, 100},{2, 5, 100},{3, 4, 100}};
		int n=arr.length;
		System.out.println(arrayManipulation(n,arr));
		
	}
}