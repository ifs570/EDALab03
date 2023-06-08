public class QueueLink<E> implements Queue<E> {
  private NodeCola<E> root;

  public QueueLink(){
    this.root = null;
  }
 
  public boolean add (E x) throws ExceptionIsEmpty{
    if(isEmpty())
      this.root = new NodeCola<E>(x,this.root);
    else {
      NodeCola<E> aux = this.root;
      for(; aux.getNext() != null; aux = aux.getNext());
      aux.setNext(new NodeCola<E>(x));
    }
    return true;
  }
  public boolean offer(E x) {
    if(isEmpty())
      this.root = new NodeCola<E>(x,this.root);
    else{
      NodeCola<E> aux = this.root;
      for(; aux.getNext() != null; aux = aux.getNext());
      aux.setNext(new NodeCola<E>(x));
    }
    return true;
  }

  public E remove() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("La cola esta vacia...");
    E item = this.root.getData();
    this.root = this.root.getNext(); 
    return item;
  }

  public E poll() {
    if (isEmpty())
      return null;
    E item = this.root.getData();
    this.root = this.root.getNext(); 
    return item;
  }

  public E element() throws ExceptionIsEmpty { 
    if (isEmpty())
      throw new ExceptionIsEmpty("La cola esta vacia...");
    E item = this.root.getData();
    return  item;
  }

  public E peek() {
    if (isEmpty())
      return null;
    E item = this.root.getData();
    return item;
  }
  public boolean isEmpty() {
    return this.root == null;
  }

  public String toString() {
    String str= "";
    for (Node<E> aux = this.root; aux != null; aux = aux.getNext()){
      str += aux.getData() + ", ";
    }
    return str;
  }
}
