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

        // ternary operator
        int result = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println(result);

        // switch case
        String day = "monday";
        switch (day) {
            case "sunday", "saturday":
                System.out.println("6am");
                break;
            case "monday":
                System.out.println("7am");
                break;
            default:
                System.out.println("8am");
        }

        // new switch case
        String week = "saturday";
        switch (week) {
            case "sunday", "saturday" -> System.out.println("6am");
            case "monday" -> System.out.println("7am");
            default -> System.out.println("8am");
        }

        String result2 = switch(week){
            case "sunday", "saturday" -> "6am";
            case "monday" -> "7am";
            default -> "8am";
        }; // have to end with a semi-colon as it is a statement
        System.out.println(result2);

        // another form
        String result3 = switch(week){
            case "sunday", "saturday": yield "6am";
            case "monday" : yield "7am";
            default : yield "8am";
        }; // have to end with a semi-colon as it is a statement
        System.out.println(result3);

    }
}
