import java.util.*;
import java.lang.*;
class Q6{
	int front,rear;
	static final int max=10;
	int arr[]=new int[max];
	Q6(){
		front=-1;
		rear=-1;
	}	
	boolean isEmpty(){return front==-1;}
	boolean isFull(){return rear==max;}
	boolean enqueue(int data){
		if(isFull()) return false;
		else{
			if(front==-1){
				front=0;
			}
			rear++;
			arr[rear]=data;
			return true;
		}
		
	}
	// int peak(){
		// return isEmpty()?0:arr[top];
	// }
	int dequeue(){
		if(isEmpty()) return -1;
		else {
			int x=arr[front];
			if(front>rear){
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
			return x;
		}
	}
	void display(){
		if(isEmpty()) return ;
		
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String [] args){
		Q6 s=new Q6();
			s.enqueue(5);
			s.enqueue(10);
			s.enqueue(11);
			// s.dequeue();
			s.display();
		}
				
	}
}