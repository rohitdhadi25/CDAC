class Q10{
	static int[] arrayLeftRotation(int [] arr,int d){
		int n=arr.length;
		d=d%n;
		int temp[]=new int[n];
		for(int i=0;i<d;i++){
			temp[i]=arr[i]; //temp={1, 2}   {3, 4, 5}
		}
		for(int i=d;i<n;i++){
			arr[i-d]=arr[i];//shifting has done
		}
		for(int i=n-d;i<n;i++){
			arr[i]=temp[i-(n-d)]; //restoring temp{1,2}at last after shifting of {3,4,5} at front
		}
		return arr;
	}
	public static void main(String [] args){
		
		int arr[]={10, 20, 30, 40};
		int d=5;//d=4(max rotation)+1 ---{20,30,40,10}
		int res[]=arrayLeftRotation(arr,d);
		for(int e:res){
			System.out.print(e+" ");
		}
	}
}