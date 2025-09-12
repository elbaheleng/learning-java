class Human {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
       
    }

}
public class privatevariables {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(11);
        obj1.setName("Elba");
        System.out.println(obj1.getAge()+ " "+obj1.getName());

    }
}
