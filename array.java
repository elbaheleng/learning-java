public class array {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("new for loop syntax");
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // jagged array
        int jaggedarray[][] = new int[3][];
        jaggedarray[0] = new int[2];
        jaggedarray[1] = new int[4];
        jaggedarray[2] = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                jaggedarray[i][j] = (int) (Math.random() * 10);
            }
        }
         for (int n[] : jaggedarray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
