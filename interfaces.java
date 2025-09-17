interface A {
    int AGE = 35;
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X{

}

class B implements A,Y {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
                System.out.println("in run");

    }
}

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class interfaces {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.AGE);
        X obj1 = new B();
        obj1.run();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer elba = new Developer();
        elba.devApp(lap);
        elba.devApp(desk);
    }
}
