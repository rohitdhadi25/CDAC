// . Sort an array using a heap (Heap Sort).
// Implement a Max-Heap.
class Q11{
	static void maxHeap(int arr[] ,int n,int i){
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n && arr[l]> arr[largest]){
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]){
			largest=r;
		}
		if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeap(arr,n,largest);
		}
	}
	static void heap(int[]arr){
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--){
			maxHeap(arr,n,i);
		}
		for(int i=n-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeap(arr,i,0);
		}
	}
	static void display(int arr[] ,int n){
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Q11 q=new Q11();
		int arr[]={11,100,29,99,1,-1,0};
		int n=arr.length;
		display(arr,n);
		heap(arr);
		display(arr,n);
	}
}