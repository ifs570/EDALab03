public interface Queue<E> {
  boolean add(E x) throws ExceptionIsEmpty;
  boolean offer(E x); 
  E remove() throws ExceptionIsEmpty; 
  E poll() ; 
  E element() throws ExceptionIsEmpty;
  E peek();
  boolean isEmpty();
}
