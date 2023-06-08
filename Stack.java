public class Stack<T extends Comparable<T>> implements StackInterface<T> {
	
	private Node<T> root;
	
	public boolean isEmpty() {
		return this.root==null;
	}
	
	public T peek() throws ExceptionIsEmpty{//Mira el objeto superior de la pila sin sacarlo
		Node<T> aux = this.root;
		while(aux.getNextNode() != null)
			aux = aux.getNextNode();
		
		return aux.getDato();
	}
	
	public T pop() throws ExceptionIsEmpty{//Devuelve y elimina el objeto superior de la pila
		Node<T> aux = this.root;
		while(aux.getNextNode().getNextNode() != null) 
			aux = aux.getNextNode();
		T var = aux.getNextNode().getDato();
		aux.setNextNode(null);
		return var;
	}
	
	public T push(T item) {
		if(this.isEmpty()) {
			this.root=new Node<T>(item);
		}
		else {
			Node<T> aux = this.root;
			while(aux.getNextNode()!=null) {
				aux=aux.getNextNode();
			}
			aux.setNextNode(new Node<T>(item));

		}
		return item;
		
	}
	
	public int search(T element) {
		Node<T> aux = this.root;
		int pos=1;
		boolean b= false;
		do {
			if (aux.getDato().compareTo(element)==0) {
				b = true;
				return pos;
			}
			else {
				aux=aux.getNextNode();
				pos++;
			}
		}
		while (aux.getNextNode() != null);
			
		if(b)
			return pos;
		else
			return -1;
	}
	
	public String toString() {
		String str = "";
		Node<T> aux = this.root;
		while (aux.getNextNode() != null) {
			str += aux.getDato()+",";
			aux = aux.getNextNode();
		}
		
		return str+=aux.getDato();
	}

}
