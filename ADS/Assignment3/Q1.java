class Q1{
	int top;
	static final int max=10;
	int arr[]=new int[max];
	Q1(){top=-1;}	
	boolean isEmpty(){return top<0;}
	boolean isFull(){return top>=max-1;}
	boolean push(int x){
		if(isFull()) return false;
		else
			arr[++top]=x;
			return true;
	}
	int peak(){
		return isEmpty()?0:arr[top];
	}
	void pop(){
		if(isEmpty()) System.out.println("-1");
		else System.out.println("Popped element= "+arr[top--]);	
	}
	void display(){
		if(isEmpty()) return ;
		else show(top);
		
	}
	void show(int index){
		if(index<0) return ;
		else
			System.out.print(arr[index]+" ");
			show(index-1);
	}
	
	public static void main(String [] args){
		Q1 s=new Q1();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		s.pop();
		s.display();
		

		// int x=s.peak();
		// System.out.println("peak "+x);
		
		
	}
}