class Q5{
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
	Node insert(int data){
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
		return head;
	}
	// Node reverse(Node head){
		// Node prev=null;
		// Node curr=head;
		// Node Next=null;
		// while(curr!=null){
			// Next=curr.next;
			// curr.next=prev;
			// prev=curr;
			// curr=Next;
		// }
		// head=prev;
		// return head;
	// }
	int searchFromBehind(int pos){
		Node prev=null;
		Node curr=head;
		Node Next=null;
		while(curr!=null){
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
		}
		head=prev;
		// Node p=head;
		for(int i=0;prev!=null && i<pos-1;i++){
			prev=prev.next;
		}
		return prev.data;
	}
	void display(Node head){
		Node p=head;
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	public static void main(String [] args){
		Q5 q=new Q5();
		q.head=new Node(5);
		q.head.next=new Node(6);
		q.head.next.next=new Node(7);
		q.head.next.next.next=new Node(8);
		q.head.next.next.next.next=new Node(9);
		q.head=q.insert(1);
		q.display(q.head);
		System.out.print(q.searchFromBehind(3));
	}
}
