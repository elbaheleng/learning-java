public class strings {
    public static void main(String[] args) {
        //Strings are immutable
        String name = new String("Elba");
        System.out.println(name.concat(" Helen George"));
        //StringBuffers are mutable
        StringBuffer name1 = new StringBuffer("Sajan");
        name1.append(" Varghese");
        System.out.println(name1);
        name1.insert(0,"Java");
        System.out.println(name1);

    }
}
