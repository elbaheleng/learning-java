class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A obj2 = new A() { //anonymous inner class, this class is created inside Demo class and has no name
            public void show() {
                System.out.println("in new show");
            }
        };
        obj2.show();

    }
}
