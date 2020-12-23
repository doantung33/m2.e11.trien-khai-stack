public class GenericStackClint {
    public static void stackOfInteger(){
        MyGenericStack<Integer> myGenericStack= new MyGenericStack();
        myGenericStack.push(1);
        myGenericStack.push(2);
        myGenericStack.push(3);
        myGenericStack.push(4);
        myGenericStack.push(5);
        System.out.println("Size of stack after push operations: "+ myGenericStack.size());
        System.out.println("Pop element form stack: ");
        while (!myGenericStack.isEmpty()){
            System.out.print( myGenericStack.pop()+" , ");
        }
        System.out.println("\nSize of stack after pop operations: "+myGenericStack.size());
    }
    public static void stackOfString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack();
        myGenericStack.push("one");
        myGenericStack.push("two");
        myGenericStack.push("three");
        myGenericStack.push("for");
        myGenericStack.push("five");
        System.out.println("Size of stack after push operations: "+myGenericStack.size());
        System.out.println("Pop element form stack");
        while (!myGenericStack.isEmpty()){
            System.out.print(myGenericStack.pop()+" , ");
        }
        System.out.println("\nSize of stack after pop operations: "+myGenericStack.size());
    }
}
