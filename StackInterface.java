public interface StackInterface<T> {
	boolean isEmpty();
	T peek() throws ExceptionIsEmpty;
	T pop() throws ExceptionIsEmpty;
	T push(T item);
	int search(T element);

}
