import java.util.Stack;
public class Main{
  public static void main(String[] args) {
    //stack = LIFO data structure. Last-In first out
    //      stores objects into a  sort  of  "vertical  tower"
    //      push() to add to the top
    //      pop() to  remove from the top
    
    Stack<String> stack = new Stack<String>();
    
    stack.push("hello0");
    stack.push("hello1");
    stack.push("hello2");
    stack.push("hello3");
    stack.push("nothing just fun");
    stack.push("nothing");
    

    String myLastWord = stack.pop(); //it will always remove the last element that added to the stack
    System.out.println(stack);

    // it will show the last inputed data without any removing in the list 
    System.out.println(stack.peek());

    //it will show the all the element in the stack by the order of how it added 
    System.out.println(myLastWord);
    
    //it will  search in the stack and then show the arranged order of the element 
    System.out.println(stack.search("hello3"));
  }

  
}

// use of stack
//
// 1. undo/redo feature in  text editor 
// 2. moving back/forward through browser history
// 3. backtracking  algorthms (maze, file directories)
// 4. calling functions (call stack)
