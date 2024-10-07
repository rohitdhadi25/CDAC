import java.util.*;
import java.lang.*;
class Q5{
	int top;
	static final int max=10;
	char arr[]=new char[max];
	Q5(){top=-1;}	
	boolean isEmpty(){return top<0;}
	boolean isFull(){return top>=max-1;}
	boolean push(char i){
		if(isFull()) return false;
		else
			arr[++top]=i;
			return true;
	}
	char Top(){
		return isEmpty()?0:arr[top];
	}
	int pop(){
		if(isEmpty()) return -1;
		else return arr[top--];	
	}
	static int priority(char x){
		if(x=='^') return 3;
		if(x=='*' || x== '/') return 2;
		if(x=='+' || x== '-') return 1;
		return 0;
	}
	public static void main(String [] args){
		Q5 s=new Q5();
		String str="a+b*(c^d-e)";
		char [] c=str.toCharArray();
		int n=c.length;
		String ans="";
		int i=0;
		while(i<n){
			if((c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z') || (c[i]>='0' && c[i]<='9')){
				ans=ans+c[i]; //add to our string
			}
			else if(c[i]=='('){
				s.push(c[i]);
			}
			else if(c[i]==')'){
				while(s.isEmpty() && s.Top()!='('){
					ans=ans+s.Top();
					s.pop();
				}
				s.pop();
			}
			else {
				while(s.isEmpty() && priority(s.Top()) >= priority(c[i]) ){
					ans=ans+s.Top();
					s.pop();
				}
				s.push(c[i]);
			}
			i++;
		}
		while(!s.isEmpty()){
			ans=ans+s.Top();
			s.pop();
		}
		System.out.println(ans);
		
	}
			
}