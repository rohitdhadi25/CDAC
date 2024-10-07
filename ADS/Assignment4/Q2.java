class Q2{
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
	void delete(int key){ //7
		//3
		//3 > 7 > 5 del(7) inse(5)--->3 > 5 
		Node p=head;
		Node prev=null;
		if(head!=null && p.data==key){
			head=p.next;
			return ;
		}
		while(p!=null && p.data!=key){
			prev=p;
			p=p.next;
		}
		prev.next=p.next;
		return ;
	}
	Node reverseLL(Node node){
			Node prev=null;
			Node curr=node;
			Node next=null;
			while(curr!=null){
				next=curr.next;
				curr.next=prev; //reverse a link as prev is null
				prev=curr;
				curr=next;
			}
			node=prev;
			return node;
	}
	void printReverseLL(Node p){
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	void display(){
		Node p=head;
		
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	public static void main(String [] args){
		Q2 q=new Q2();
		
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.display();
		q.head=q.reverseLL(q.head);
		q.printReverseLL(q.head);
		
	}
}

