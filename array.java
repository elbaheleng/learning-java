class student {
    int rollno;
    String name;
    int marks;
}

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

        // creating instances for student class
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.rollno = 1;
        s1.name = "Elba";
        s1.marks = 99;
        s2.rollno = 2;
        s2.name = "Emil";
        s2.marks = 70;
        s3.rollno = 3;
        s3.name = "Meera";
        s3.marks = 100;
        // creating an array of type student
        student studentsarray[] = new student[3];
        studentsarray[0] = s1;
        studentsarray[1] = s2;
        studentsarray[2] = s3;
        for(int i = 0; i<studentsarray.length; i++)
        {
            System.out.println(studentsarray[i].name + " : " + studentsarray[i].marks);
        }

    }
}
