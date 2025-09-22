class Z {

}

class A extends Z implements Runnable { // A extends Z so cant extend Thread class, hence implement runnable interface
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

        Runnable ob3 = () -> { // lambda expression
                for (int index = 0; index < 5; index++) {
                    System.out.println("welcome");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Thread t1 = new Thread(ob3); 
        t1.start();


    }
}
