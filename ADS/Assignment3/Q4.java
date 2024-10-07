import java.util.*;
import java.lang.*;
class Q4{
	int top;
	static final int max=10;
	int arr[]=new int[max];
	Q4(){top=-1;}	
	boolean isEmpty(){return top<0;}
	boolean isFull(){return top>=max-1;}
	
	boolean push(int i){
		if(isFull()) return false;
		else
			arr[++top]=i;
			return true;
	}
	int Top(){
		return isEmpty()?0:arr[top];
	}
	int pop(){
		if(isEmpty()) return -1;
		else return arr[top--];	
	}
	
	
	public static void main(String [] args){
		Q4 s=new Q4();
		String str="53+2*";
		char[] ch=str.toCharArray();
		for(char c:ch ){
			if(Character.isDigit(c)==true){
				s.push(Character.getNumericValue(c));	
			}
			else {
					int a=s.pop();
					int b=s.pop();
					switch(c){
						case '+':s.push(b+a);
							break;
						case '-':s.push(b-a);
							break;
						case '*':s.push(b*a);
							break;
						case '/': if (a != 0) {
								s.push(b / a);
								} 	
							break;
						default: 
							break;	
					}
					
				}
			}
		
			if(!(s.isEmpty())){
				System.out.print(s.pop());
			}
		}
			
		
}