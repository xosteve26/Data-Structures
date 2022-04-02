public class LinkedList{
  
  private class Node{
    private int value;
    private int next;
    public Node(int val){
      this.value=val;
      this.next=null;
    }
  }
  
  private Node head;
  private Node tail;

  public void addLast(int item){
    Node node=new Node(item);
    
    if (head == null){
      head=tail=node;
    }
    else{
      tail.next=node;
      tail=node;
    }
    
  }
}