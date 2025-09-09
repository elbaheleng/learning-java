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

    }
}
