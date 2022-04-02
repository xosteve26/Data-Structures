import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    LinkedList list=new LinkedList();
    
    list.addFirst(44);
    list.addLast(3);
    list.addLast(56);
    list.addLast(60);
    // list.deleteFirst();
    // list.deleteLast();
    // System.out.println(list.indexOf(3));
    System.out.println(list.size());
    System.out.println(Arrays.toString(list.toArray()));
    
    
    
  }
}