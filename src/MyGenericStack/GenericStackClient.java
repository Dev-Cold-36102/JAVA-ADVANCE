package MyGenericStack;

public class GenericStackClient {
    public static void stackOfString() {
        MyGenericStack<String> stack=new MyGenericStack();
        stack.push("five");
        System.out.println("size="+stack.size());
        System.out.println("pop:");
        while (!stack.isEmpty()) {
            System.out.printf("%s",stack.pop());
        }
        System.out.println("size after="+stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack =new MyGenericStack();
        stack.push(36102);
        System.out.println("size="+stack.size());
        System.out.println("pop");
        while (!stack.isEmpty()) {
            System.out.printf("%d",stack.pop());
        }
        System.out.println("sizeafter="+stack.size());
        }

    public static void main(String[] args) {
        System.out.println("integer:");
        stackOfIntegers();;
        stackOfString();;
    }
    }

