import com.sun.security.jgss.GSSUtil;

public class StackLinkedList {

    Node top;


    public void push(int data) {

        if(top == null) {
            top = new Node(data);
        }
        else {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Added element to stack");
    }

    public void pop() throws Exception {

        if(top == null) {
            throw new Exception("Stack is Empty");
        }
        else{
            top = top.next;
            System.out.println("Removed element from stack");
        }
    }
}
