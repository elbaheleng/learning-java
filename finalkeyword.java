final class A{
    public final void show(){
        System.out.println("in A show");
    }
}
class B {
    public final void show(){
        System.out.println("in B show");
    }
}

class C extends B {
    // cant have show() here because it is defined as final in the parent class B
}
public class finalkeyword {
    public static void main(String[] args) {
        final int NUM = 8;
        System.out.println(NUM);

        A obj = new A();
        obj.show();

         B obj1 = new B();
        obj1.show();

         C obj2 = new C();
        obj2.show();
    }
}
