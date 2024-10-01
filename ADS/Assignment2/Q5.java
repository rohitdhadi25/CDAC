class Q5{
	static int[] reverseArray(int[] arr){
		for(int i=0;i<arr.length/2;++i){
					int temp=arr[i];
					arr[i]=arr[arr.length -i -1];
					arr[arr.length -i -1]=temp;
		}
		return arr;
	}
	public static void main(String[] args){
		int p[]=new int[]{1,2,3,4};
		int []arr=reverseArray(p);
		for(int e:arr){
			System.out.print(e+" ");
		}
		
	}
}