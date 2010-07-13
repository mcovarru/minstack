package minstack;

import java.util.Stack;

public class MinimumStack<E extends Comparable<E>> extends Stack<E> {

  private static final long serialVersionUID = -9097051912527108478L;
  
  /**
   * Separate stack to track the minimum element in the main stack. 
   * 
   */
  private Stack<E> minima = new Stack<E>();
  
  @Override
  /**
   * If the minima stack is empty or the element being pushed is 
   * equal to or less than the element on the top of the minima stack,
   * push this element onto the minima stack.  In all cases push item
   * onto the main stack.
   */
  public E push(E item) {
    
    if (minima.empty() || item.compareTo(minima.peek()) <= 0) 
      minima.push(item);
    return super.push(item);
  }
  
  
  @Override
  /**
   * If the element on the top of the main stack is the same
   * element that's at the top of the minima stack, pop the 
   * minima stack.  In all cases pop the main stack.  
   */
  public E pop() {
    if (minima.peek() == super.peek())
      minima.pop();
    return super.pop();
  }
  
  
  /**
   * @return the current minimum value in the main stack,
   * which is the top element in the minima stack
   */
  public E minimum() {
    return minima.peek();
  }
}
