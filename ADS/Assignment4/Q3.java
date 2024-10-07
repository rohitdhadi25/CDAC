class Q3{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void insert(int data){
		Node n=new Node(data);
		n.next=head;
		head=n;
		return; 
	}
	
	static boolean detectLoop(Node n){
		Node slow=n;
		Node fast=n;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String [] args){
		Q3 q=new Q3();
		q.head=new Node(5);
		q.head.next=new Node(6);
		q.head.next.next=new Node(7);
		q.head.next.next.next=new Node(8);
		q.head.next.next.next.next=new Node(9);
		q.head.next.next.next.next.next=new Node(10);
		q.head.next.next.next.next.next=q.head;
		System.out.println(q.detectLoop(q.head));
	}
}

