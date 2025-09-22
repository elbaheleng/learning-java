class Z{
    
}

class A extends Z implements Runnable{ //A extends Z so cant extend Thread class, hence implement runnable interface
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

        Runnable ob1 = new A(); 
        Thread t = new Thread(ob1); // connection between thread and A, then only start() will work
        t.start();

        B ob2 = new B();
        ob2.start();



    }
}
