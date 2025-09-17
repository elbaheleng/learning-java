enum Day {
    SUNDAY, MONDAY("light blue"), TUESDAY("dark blue"), WEDNESDAY("orange"), THURSDAY("light blue"), FRIDAY("dark blue"), SATURDAY;


private String color;
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
private Day() {
this.color = "red";
}
private Day(String color) {
    this.color = color;
}

}

public class enumeration {
    public static void main(String[] args) {
        Day d = Day.SUNDAY;
        System.out.println(d);// SUNDAY
        System.out.println(d.ordinal());// 0

        Day[] dayArray = Day.values();// .values() returns an array
        System.out.println(dayArray); // address
        System.out.println(dayArray[1]); // MONDAY

        for (Day day : dayArray) {
            System.out.println(day + ":" + day.ordinal() + ":" + day.getColor());
        }

        Day day1 = Day.SUNDAY;
        // if else
        if (day1 == Day.SUNDAY)
            System.out.println("Today is Sunday");
        else if (day1 == Day.MONDAY)
            System.out.println("Today is Monday");
        else
            System.out.println("Some other day");
        // switch
        switch (day1) {
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Some other day");

                break;
        }
    }
}
