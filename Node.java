public class Node<T> {
	private T dato;
	private Node<T> nextNode;
	
	public Node() {
	}
	public Node(T dato) {
		this.dato = dato;
	}
	public Node(T dato, Node<T> nextNode) {
		this.dato = dato;
		this.nextNode = nextNode;
	}
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	

}
