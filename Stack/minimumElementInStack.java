// here we need to create three function push(), pop(), minElement()  
// and we can call any at any time and that function should return exact value


import java.util.*;

public class minimumElementInStack {
    static Stack<Integer> stack = new Stack<>();
   static Stack<Integer> supportingStack = new Stack<>();

    public static void pop(){
        int popElement=0;
        if(stack.isEmpty()){
            return;
        }
        else if(stack.peek() == supportingStack.peek()){
            popElement = stack.peek();
            stack.pop();
            supportingStack.pop();
            System.out.println("Pop element is "+popElement);
        }
        else{
            popElement = stack.peek();
            stack.pop();
            System.out.println("Pop element is "+popElement);
        }
    }

    public static void push(int n){
         if(stack.isEmpty()){
            stack.push(n);
            supportingStack.push(n);
         }

         else{
            if(supportingStack.peek()>n){
                supportingStack.push(n);
                stack.push(n);
            }
            else{
                stack.push(n);
            }
         }

         System.out.println("The new element added "+n);
    }
    
    public static  void minElement(){
        if( supportingStack.isEmpty()){
           System.out.println("there is no element in stack");
        }
        else{
            System.out.println("The min element in stack is "+supportingStack.peek());
        }
    }


    public static void main(String[] args) {
        minElement();
        push(2);
        minElement();
        push(22);
        push(1);
       
        minElement();
         pop();
    }
}
