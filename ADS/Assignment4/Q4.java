class Q4{
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
	//////////////////////////////////////////////
	Node mergeSort(Node m1, Node m2){
		Node r;
		if(m1==null) {return m2;}
		if(m2==null) {return m1;}
		if(m1.data<=m2.data){
			r=m1;
			r.next=mergeSort(m1.next,m2);
			// return m1;
		}
		else{
			r=m2;
			r.next=mergeSort(m1,m2.next);
			// return m2;
		}
		return r;
	}
	Node merge(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node middle=getmiddle(head);
		// Node leftStarting=head;
		Node rightStarting=middle.next;
		middle.next=null;
		
		Node left=merge(head);
		Node right=merge(rightStarting);
		return mergeSort(left,right);
	}
	
	Node getmiddle(Node head){
		if(head==null) return head;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
		
	}
	//////////////////////////////////////////////////////////////
	void display(){
		Node p=head;
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	
	
	public static void main(String [] args){
		Q4 q1=new Q4();
		q1.head=new Node(7);
		q1.head.next=new Node(8);
		q1.head.next.next=new Node(9);
		q1.head.next.next.next=new Node(10);
		q1.head.next.next.next.next=new Node(11);
		q1.head.next.next.next.next.next=new Node(12);
		// q.head.next.next.next.next.next=q.head;
		// System.out.println(q.detectLoop(q.head));
		
		Q4 q2=new Q4();
		q2.head=new Node(1);
		q2.head.next=new Node(2);
		q2.head.next.next=new Node(3);
		q2.head.next.next.next=new Node(4);
		q2.head.next.next.next.next=new Node(5);
		q2.head.next.next.next.next.next=new Node(6);
		
		q1.head=q1.merge(q1.head);
		q2.head=q2.merge(q2.head);
		
		
		Q4 mq3=new Q4();
		mq3.head=mq3.mergeSort(q1.head,q2.head);
		
		mq3.display();
		
		
	}
}

