package ChapterSixteen;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    private static void printStack( Stack<Number> stack){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.printf("Stack Contains: %s (top) %n", stack);
        }
    }
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(12L);
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(345);
        System.out.println("added 345");
        printStack(stack);
        stack.push(20.45D);
        printStack(stack);
        System.out.println("Added 20.450");
        stack.push(20.0F);
        printStack(stack);
        System.out.println("Added 1.0F");

        try{
            Number removedObject = null;
            while(!stack.isEmpty()){
                System.out.println("After popping, stack contains: ");
                removedObject = stack.pop();
                printStack(stack);
            }
        }catch(EmptyStackException emptyStackException){
            emptyStackException.printStackTrace();
        }

    }

}
