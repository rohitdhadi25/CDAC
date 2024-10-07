import java.util.*;
import java.lang.*;
class Q7{
	int front,rear;
	static final int max=10;
	int arr[]=new int[max];
	Q7(){
		front=-1;
		rear=-1;
	}	
	boolean isEmpty(){return front==-1;}
	boolean isFull(){return ((rear+1)%max)==front;}
	void enqueue(int data){
		if(isFull()) return ;
		else{
			if(front==-1){
				front=0;
			}
			rear=(rear+1)%max;
			arr[rear]=data;
			
		}
		
	}
	int peak(){
		return isEmpty()?0:arr[top];
	}
	int dequeue(){
		if(isEmpty()) return -1;
		else {
			int x=arr[front];
			if(front==rear){
				front=-1;
				rear=-1;
			}
			else
			{
				front=(front+1)%max;
			}
			return x;
		}
	}
	void display(){
		
		if(isEmpty()) return ;
		else{
				int i=front;
				while(i!=rear){
				System.out.print(arr[i]+" ");
				i=(i+1)%max;
				}	
			System.out.print(arr[rear]);
			System.out.println();
		}
		
	}
	public static void main(String [] args){
			Q7 s=new Q7();
			s.enqueue(1);
			s.enqueue(2);
			s.enqueue(3);
			s.enqueue(4);
			s.dequeue();
			s.dequeue();
			s.enqueue(5);
			s.display();
	}
				
	
}
