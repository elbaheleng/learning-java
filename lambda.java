@FunctionalInterface
interface A {
    void show(int i);
}

public class lambda {
    public static void main(String[] args) {
        // normal way
        // A obj = new A() {
        // public void show() {
        // System.out.println("in show");
        // }
        // };

        // another way - lambda
        // A obj = () -> {
        // System.out.println("in show");
        // };

        // for function accepting parameters
        // A obj = (i) -> {
        //     System.out.println("in show " + i);
        // };

        //simplified - brackets removed
        A obj = i -> System.out.println("in show " + i);
    

        obj.show(5);
    }
}
