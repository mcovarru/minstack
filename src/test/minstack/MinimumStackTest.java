package test.minstack;


import static org.junit.Assert.*;
import minstack.MinimumStack;

import org.junit.Test;

public class MinimumStackTest {

  
  @Test
  /**
   * Simple test of a MinimumStack<java.lang.Integer> similar to that
   * discussed during interview
   */
  public void java_lang_Integer() {
    
    Integer [] ints;
    Integer [] minima;
    ints = new Integer [] {5, 3, 4, 3, 1, 3, 2, 3};
    
    // traverse this back to front; easier to look at it this way
    minima = new Integer [] {5, 3, 3, 3, 1, 1, 1, 1};
    
    MinimumStack<Integer> minStack = new MinimumStack<Integer>();
    
    for (int i = 0; i < ints.length; i++)
      minStack.push(ints[i]);
    
    for (int i = 0; i < ints.length; i++) {
      assertEquals(minima[minima.length - i - 1], minStack.minimum());
      minStack.pop();
    }
    
  }
  
  
  @Test
  /**
   * Simple test of a MinimumStack<java.lang.String> using a Lorem ipsum snippet
   */
  public void java_lang_String() {
    
    String [] strings;
    String [] minima;
    
    String loremIpsum = "lorem ipsum dolor sit amet consectetur adipisici elit";
    
    strings = loremIpsum.split(" ");
    // again traversing back to front
    minima = new String [] {
        "lorem", "ipsum", "dolor", "dolor", "amet", "amet", "adipisici", "adipisici"
    };
    
    MinimumStack<String> minStack = new MinimumStack<String>();
    for (int i = 0; i < strings.length; i++)
      minStack.push(strings[i]);
    
    for (int i = 0; i < strings.length; i++) {
      assertEquals(minima[minima.length - i - 1], minStack.minimum());
      minStack.pop();
    }
    
    
  }

}
