public class wrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num); // boxing, this style deprecated
        System.out.println(num1);

        Integer num2 = 6; //auto boxing
        System.out.println(num2);

        int num3 = num2.intValue(); // unboxing,  num2 is an object
        System.out.println(num3);


        int num4 = num1; // auto unboxing
        System.out.println(num4);

        String str = "12";
        int num5 = Integer.parseInt(str);
        System.out.println(num5);
    }
}
