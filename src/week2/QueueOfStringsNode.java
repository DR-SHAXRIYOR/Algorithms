package week2;

public class QueueOfStringsNode {

  private Node first = null;
  private Node last = null;
  private class Node {
    String item;
    Node next;
  }
  
  public boolean isEmpty() {
    return first == null;
  }
  
  public void enqueue(String item) {
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) first = last;
    else oldLast.next = last;
  }

  public String dequeue() {
    String item = first.item;
    first = first.next;
    if (isEmpty()) last = null;
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