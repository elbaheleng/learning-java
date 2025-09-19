class A extends Thread{
    public void run()
    {
        for (int index = 0; index < 100; index++) {
            System.out.println("hi");
        }
    }
}
class B extends Thread{
    public void run()
    {
        for (int index = 0; index < 100; index++) {
            System.out.println("hello");
        }
    }
}
public class threads {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        ob1.start();
        ob2.start();



    }
}
