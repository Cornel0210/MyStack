public class Main {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.empty());

    }
}
