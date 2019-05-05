package week2;

import java.util.LinkedList;

public class StackOfStrings {

  private LinkedList<String> state = new LinkedList<String>();
  public void push(String item) {
      state.add(item);
  }

  public String pop() {
    int ind = state.size();
    String item = state.get(ind - 1);
    state.remove(ind - 1);
    return item; 
  }
  public boolean isEmpty() {
    return state.size() == 0;
  }

  public int size() {
    return state.size();
  }
}