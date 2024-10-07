class Q2{
	int top;
	static final int max=10;
	char arr[]=new char[max];
	Q2(){top=-1;}	
	boolean isEmpty(){return top<0;}
	boolean isFull(){return top>=max-1;}
	boolean push(char x){
		if(isFull()) return false;
		else
			arr[++top]=x;
			return true;
	}
	char Top(){
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
			System.out.print(arr[index]+" ");
			show(index-1);
	}
	
	public static void main(String [] args){
		Q2 s=new Q2();
String str="({[()]})";
		char []arr=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
				s.push(arr[i]);	
			}
			else{
				if(s.isEmpty())
				{
				System.out.print("Not Balanced");//i donnot have any brackets 
				return ;	
				}
				else{
					char c=s.Top();
					s.pop();
					if((arr[i]==')' &&  c=='(') || (arr[i]=='}' && c=='{') || (arr[i]==']' && c=='[')){
						// System.out.print("Balanced");
						continue;
					}
					else{
						System.out.print("Not Balanced");
					}
				}
			}	
		}
		if(s.isEmpty()==true){
			System.out.print("Balanced");
		}
		else{
			System.out.print("Not Balanced");
		}
		
		
	}
}