public class conditional {
    public static void main(String[] args) {
        int x = 10;
        if (x > 10)
            System.out.println("hello");
        else
            System.out.println("bye");

        int a = 3;
        int b = 1;
        int c = 2;
        if (a > b && a > c)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);

        //ternary operator
        int result = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println(result);

    }
}
