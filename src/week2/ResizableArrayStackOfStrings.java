package week2;

import java.util.Arrays;
import java.util.LinkedList;

public class ResizableArrayStackOfStrings {

  private String[] state = new String[1];
  int n = 0;

  public void push(String item) {
    if (n == state.length) {
      resize(2 * state.length);
    }
    state[n++] = item;
  }

  private void resize(int m) {
    String[] newState = new String[m];
    for (int i = 0; i < state.length; i++) {
      newState[i] = state[i];
    }
    state = newState;
  }

  public String pop() {
    String item = state[--n];
    state[n] = null;
    if (n > 0 && n == state.length/4) resize(state.length / 2);
    return item; 
  }

  public boolean isEmpty() {
    return state.length == 0;
  }

  public int size() {
    return state.length;
  }
  
}