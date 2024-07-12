import com.sun.security.jgss.GSSUtil;

public class StackLinkedList {

    Node top; //stackTop

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

        checkStackEmpty(); // checking stack is empty
        top = top.next;
        System.out.println("Removed element from stack");
    }

    public void printStack() throws Exception {

        checkStackEmpty(); // checking stack is empty
        Node currentNode = top;
        while(currentNode!=null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void peek() throws Exception {

        checkStackEmpty(); // checking stack is empty
        System.out.println("Stack Top: "+top.data);
    }

    public boolean isEmpty() {

        return top==null;
    }

    public void checkStackEmpty() throws Exception {

        if(top == null) {
            throw new Exception("Stack is Empty");
        }
    }

}
