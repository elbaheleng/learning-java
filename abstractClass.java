abstract class Car {
    public abstract void drive();
    public abstract void playMusic();
}
class Maruti extends Car {
    public void drive(){
        System.out.println("driving");
    }
    public void playMusic(){
        System.out.println("play Music");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Maruti obj = new Maruti();
        obj.drive();
        obj.playMusic();

        
    }
}
