public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface<Integer> s = new Stack<Integer>();
		
		try {
			//Metodo push(insertar en la pila)
			s.push(2);
			System.out.println(s);
			s.push(4);
			System.out.println(s);
			s.push(6);
			System.out.println(s);
			s.push(8);
			System.out.println(s);
			s.push(10);
			System.out.println(s);
			s.push(12);
			System.out.println(s);
			s.push(14);
			System.out.println(s);
			//Metodo peek(mira el objeto sin sacarlo)
			System.out.println("Metodo peek");
			System.out.println(s.peek());
			System.out.println(s);
			//Metodo pop(mira el objetp y lo saca)
			System.out.println("Metodo pop");
			System.out.println(s.pop());
			System.out.println(s);
			//Metodo search(devuelve la posicion)
			System.out.println("Metodo search");
			System.out.println(s.search(10));
			System.out.println(s.search(3));
		}
		
		catch (ExceptionIsEmpty e) {
			System.err.println(e.getMessage());
		}
	}

}
