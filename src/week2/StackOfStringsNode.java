package week2;

public class StackOfStringsNode {

  private Node first = null;
  private class Node {
    String item;
    Node next;
  }
  
  public boolean isEmpty() {
    return first == null;
  }
  
  public void push(String item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
  }

  public String pop() {
    String item = first.item;
    first = first.next;
    return item; 
  }

  public int size() {
    int counter = 0;
    Node node = first;
    while (node != null) {
      node = node.next;
      counter++;
    }
    return counter;
  }
}