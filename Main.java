class Main {
  public static void main(String[] args) {
    Array numbers=new Array(3);
    numbers.insert(30);
    numbers.insert(14);
    numbers.insert(35);
    numbers.insert(33);
    numbers.insert(32);
    numbers.insert(31);
    numbers.delete(9);
    numbers.print();
  }
}