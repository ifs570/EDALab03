public class NodeCola<E> {
  private E data;
  private NodeCola<E> next;

  public NodeCola(E data, NodeCola<E> next) {
    this.data = data;
    this.next = next;
  }

  public NodeCola (E data){
    this(data, null);
  }
  public E getData() {
    return this.data;
  }
  public void setData(E data) {
    this.data = data;
  }
  public NodeCola<E> getNext() {
    return this.next;
  }
  public void setNext(NodeCola<E> next) {
    this.next = next;
  }
  public String toString() {
    return this.data.toString();
  }
}
