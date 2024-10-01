import java.util.Stack;

class Q6{
	static String reverseTillWords(String str){
		Stack<String>st=new Stack<>();
		String []strArr =str.split(" "); 
		String as="";
		/* for(String e: strArr){
				st.push(e);
		}
		while(!st.empty()){
			as=as+st.pop()+" ";	
		} */
		for(int i=strArr.length-1;i>=0;i--){
			as=as+strArr[i]+" ";
		}
		return as;
	}
	public static void main(String [] args){
		String str="Hello World";
		System.out.println(reverseTillWords(str));
	}
}