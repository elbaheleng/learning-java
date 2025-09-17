class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}
public class upDownCasting {
    public static void main(String[] args) {
        A obj = (B) new B(); // upcasting,  (B) is optional, address of B in heap assigned to obj of type A
        obj.show1();

        B obj1 = (B) obj; //downcasting
        obj1.show2();
    }
}
