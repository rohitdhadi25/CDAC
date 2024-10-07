class Q1{
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
	boolean search(int data){
		Node p=head;
		while(p!=null){
			if(p.data==data){
				return true;
			}
			p=p.next;
		}
		return false;
	}
	void display(){
		Node p=head;
		
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	public static void main(String [] args){
		Q1 q=new Q1();
		
		// q.head=new Node(3);
		q.insert(3);
		q.insert(7);
		q.insert(5);
		q.delete(7);
		q.display();
		System.out.println(q.search(7));
	}
}