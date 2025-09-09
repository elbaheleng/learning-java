public class iteration {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) { // nested loope
                System.out.println("Hello");
                j++;
            }
            i++;
        }

        // dowhile
        System.out.println("Do while");
        int k = 5;
        do {
            System.out.println("Hi " + k);
            k++;
        } while (k <= 4);

        //for loop
        System.out.println("for loop");
        for (int l=0;l<30;l++)
        {
            System.out.println("Hi " + (l+1));
        }

        //calender planner
        for (int l=0;l<5;l++)
        {
            System.out.println("DAY " + (l+1));
            for ( int m = 9; m<=17; m++ ){
                System.out.println("  " + m + ".00-" + (m+1) + ".00");
            }
        }

    }
}
