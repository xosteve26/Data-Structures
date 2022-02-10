
import java.util.Arrays;
class Array {
  private int[] items;
  private int count;

  public Array(int length){
    this.items=new int[length];
  }
  
  public void insert(int number){
    if(count == items.length){
      int[] newItems=new int[count*2];
      for (int i=0;i<count;i++){
        newItems[i]=items[i];
      }
      this.items=newItems;
    }
    this.items[count]=number;
    this.count++;
  }

  public void delete(int index){
    if(index<0 || index>=count){
      throw new IllegalArgumentException();
    }
    for (int i=index;i<count-1;i++){
      this.items[i]=items[i+1];
    }
    count--;

  }

  public int indexOf(int item){
    for (int i=0;i<count;i++){
      if(items[i] == item){
        return i;
      }
    }
    return -1;
    
  }

  public void print(){
    System.out.println(Arrays.toString(items));
    for(int i=0;i<count;i++){
      System.out.println(items[i]);
    }
  }
}