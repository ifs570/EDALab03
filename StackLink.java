public class StackLink <E> implements Stack2 <E>{
	private Nodo<E> tope;
	
	public StackLink() {
		this.tope=null;
	}
	
	public void push(E x) {
		this.tope=new Nodo<E>(x,this.tope);
	}
	
	public E peek() throws ExceptionIsEmpty{
		if(isEmpty())
			throw new ExceptionIsEmpty("Stack esta vacio...");
		E item=this.tope.getData();
		return item;
	}
	public boolean isEmpty() {
		return this.tope==null;
	}
}
