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
        stLin.pop();
        stLin.pop();
        System.out.println(".....................................");
        stLin.printStack();
        System.out.println(".....................................");
    }
}