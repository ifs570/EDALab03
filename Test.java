public class Test {
	public static void main(String []args) {
		
		Stack2<Integer> lint=new StackArray<Integer>(6);
		try {
		lint.push(10);
		System.out.println(lint);
		lint.push(14);
		System.out.println(lint);
		lint.push(7);
		System.out.println(lint);
		lint.push(23);
		System.out.println(lint);
		lint.push(16);
		System.out.println(lint);
		lint.push(9);
		System.out.println(lint);
		lint.push(230);
		System.out.println(lint);
		
		
		
		System.out.println("Tope: "+lint.top());
	
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}
		
		/*Stack2<Integer> lint=new StackLink<Integer>();
		try {
		lint.push(10);
		System.out.println("Tope: "+lint.peek());
		lint.push(14);
		System.out.println("Tope: "+lint.peek());
		lint.push(7);
		System.out.println("Tope: "+lint.peek());
		lint.push(23);
		System.out.println("Tope: "+lint.peek());
		lint.push(16);
		System.out.println("Tope: "+lint.peek());
		lint.push(9);
		System.out.println("Tope: "+lint.peek());
		lint.push(230);
		System.out.println("Tope: "+lint.peek());
		
		
		
		
	
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}*/
	}
}
