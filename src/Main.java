public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(".....................................");
        StackLinkedList stLin = new StackLinkedList();
        stLin.push(1);
        stLin.push(5);
        stLin.push(3);
        stLin.push(2);
        System.out.println(".....................................");
        stLin.printStack();
        System.out.println(".....................................");
        stLin.peek();
        System.out.println(".....................................");
        stLin.pop();
        stLin.pop();
        System.out.println(".....................................");
        stLin.printStack();
        System.out.println(".....................................");
        stLin.peek();
        System.out.println(".....................................");
        stLin.isEmpty();

        /*
        .....................................
        Added element to stack
        Added element to stack
        Added element to stack
        Added element to stack
        .....................................
        2
        3
        5
        1
        .....................................
        Stack Top: 2
        .....................................
        Removed element from stack
        Removed element from stack
        .....................................
        5
        1
        .....................................
        Stack Top: 5
        .....................................

        */
    }
}

