public interface Stack2<E>{
	void push(E x);
	E peek() throws ExceptionIsEmpty;
	boolean isEmpty();
}
