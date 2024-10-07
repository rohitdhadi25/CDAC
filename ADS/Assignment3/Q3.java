class Q3{
	int top;
	static final int max=10;
	char arr[]=new char[max];
	Q3(){top=-1;}	
	boolean isEmpty(){return top<0;}
	boolean isFull(){return top>=max-1;}
	boolean push(char ch){
		if(isFull()) return false;
		else
			arr[++top]=(char)ch;
			return true;
	}
	int peak(){
		return isEmpty()?0:arr[top];
	}
	int pop(){
		if(isEmpty()) return -1;
		else return arr[top--];	
	}
	void display(){
		if(isEmpty()) return ;
		else show(top);
		
	}
	void show(int index){
		if(index<0) return ;
		else
			System.out.print(arr[index]+"");
			show(index-1);
	}
	
	public static void main(String [] args){
		Q3 s=new Q3();
		String str="hello";
		char[] ch=str.toCharArray();
		for(char c:ch ){
			s.push(c);
		}
		// s.push("h");
		// s.push(2);
		// s.push(3);
		// s.push(4);
		// s.push(5);
		
		// s.pop();
		s.display();
		
		

		// int x=s.peak();
		// System.out.println("peak "+x);
		
		
	}
}