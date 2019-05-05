package week2;

import java.util.Scanner;
import week2.Stack;

public class StackClient {

  public static void main(String[] args) {
    // StackOfStrings stack = new StackOfStrings();
    // StackOfStringsNode stack = new StackOfStringsNode();
    // ResizableArrayStackOfStrings stack = new ResizableArrayStackOfStrings();
    Stack<Integer> stack = new Stack<Integer>();

    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String entry = sc.next();
      if (entry.equals("-")) {
        System.out.println("Pop:" + stack.pop());
      } else {
        stack.push(Integer.parseInt(entry));
      }
    }
    sc.close();
  }

}