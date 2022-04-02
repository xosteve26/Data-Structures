import java.util.Arrays;
public class LinkedList{
  
  private class Node{
    private int value;
    private Node next;
    public Node(int val){
      this.value=val;
      this.next=null;
    }
  }
  
  private Node head;
  private Node tail;
  private int count=0;

  public void addLast(int item){
    Node node=new Node(item);
    
    if (isEmpty()){
      head=tail=node;     
    }
    else{
      tail.next=node;
      tail=node;
    }
    count++;
    
  }

  public void addFirst(int item){
    Node node=new Node(item);
    if(isEmpty()){
      head=tail=node;
    }
    else{
      node.next=head;
      head=node;
    }
    count++;
  }

  public int indexOf(int item){
    int count=0;
    Node current = head;
    while (current !=null){
      if(current.value == item){
        return count;
      }
      current=current.next;
      count++;
    }
    return -1;
  }

  public boolean contains(int item){
    return indexOf(item)!=-1;
  }

  public void deleteFirst(){
    if(isEmpty()){
      System.out.println("LinkedList is empty!");
      return; 
    }
    if(head == tail){
      head=tail=null;
      count--;
      return;
    }
    Node secondNode=head.next;
    head=null;
    head=secondNode;
    count--;
  }

  public void deleteLast(){
    Node current=head;
    if(isEmpty()){
      System.out.println("LinkedList is empty!");
      return; 
    }
    if(head==tail){
      head=tail=null;
      count--;
      return;
    }
  
    while (current.next!=tail){
      current=current.next;
      
    }
    Node lastNode=current;
    lastNode.next=null;
    tail=lastNode;
    count--;
  }

  public int size(){
    return count;
  }

  public int[] toArray(){
    int[] array=new int[size()];
    var index=0;
    Node current=head;
    while(current!=null){
      array[index]=current.value;
      current=current.next;
      index++;
    }
    return array;
  }

  private boolean isEmpty(){
    return head==null;
  }
}