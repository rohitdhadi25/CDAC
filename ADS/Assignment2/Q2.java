import java.util.Scanner;
//{ IMPORTANT PROGRAM FOR INTERVIEWS}
class Q2{
	private static int removeDuplicates(int [] arr )
	{
		/* int size=0; */
		sort(arr);
		int j=0;
		int n=arr.length-1;
		
		for(int i=0;i<n-1;++i){
				if(arr[i]!=arr[i+1]){
					arr[++j]=arr[i];  //temp[1,2,4]; 1,1,2,2,4,4
					
				}
			
		}
		arr[j++]=arr[n-1];
		return j;
		
	}
	private static int[] sort(int[] arr){
		for(int i=0;i<arr.length;++i)
		{
			for(int j=i+1;j<arr.length;++j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		return arr;
	}
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		
		int[] arr={1,1,2,1};
		System.out.println(removeDuplicates(arr));
		
	}
}