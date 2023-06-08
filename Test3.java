public class Test3 {
  public static void main(String[] args) {
 
    System.out.println("Números:");
    Queue<Integer> Q = new QueueLink<Integer>();
    Queue<Integer> L = new QueueLink<Integer>();
    try {
      Q.add(10);
      System.out.println(Q);
      Q.add(14);
      System.out.println(Q);
      Q.add(7);
      System.out.println(Q);
      Q.offer(19);
      System.out.println(Q);											
      Q.offer(25);
      System.out.println(Q);
      System.out.println("Eliminado por el método remove: " + Q.remove());
      System.out.println("Se elimina con poll: " + Q.poll() + "\nElementos que quedan: " + Q);
      System.out.println("Elemento de Q: " + Q.element());
      System.out.println("Elemento de L: " + L.peek());
    } catch(ExceptionIsEmpty x	){ 
      System.out.println(x.getMessage());

    }
  }
}
