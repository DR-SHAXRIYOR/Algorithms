package week2;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

  private Node first = null;
  private class Node {
    T item;
    Node next;
  }
  
  public boolean isEmpty() {
    return first == null;
  }
  
  public void push(T item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
  }

  public T pop() {
    T item = first.item;
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

  private class ListIterator implements Iterator<T> {

    private Node current = first;
    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public T next() {
      T item = current.item;
      current = current.next;
      return item;
    }

  }
  @Override
  public Iterator<T> iterator() {
    return new ListIterator();
  }
}