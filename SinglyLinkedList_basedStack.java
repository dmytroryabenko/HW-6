package HW_6;

import java.util.Stack;

public class SinglyLinkedList_basedStack {
    public static void main(String[] args) {

        Stack<String> basedStack = new Stack<>();

        basedStack.push("10");
        basedStack.push("20");
        basedStack.push("30");
        basedStack.push("40");
        basedStack.push("50");
        basedStack.push("60");
        basedStack.push("70");

        System.out.println("Stack with pushed numbers: " + basedStack);

        System.out.println("Stack is Empty:  " + basedStack.empty());

        System.out.println("Stack size: " + basedStack.size());

        System.out.println("Last In First Out: ");

               while (!basedStack.isEmpty()) {
            System.out.println(basedStack.pop() + " ");
        }
    }
}
