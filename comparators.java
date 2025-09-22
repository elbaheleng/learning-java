import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class comparators {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<>() {
            public int compare(String i, String j) {
                if (i.length() > j.length())
                    return 1; // do swapping
                else
                    return -1; // dont swap
            }
        };

        List<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("goods");

        System.out.println(words);

        Collections.sort(words, com);
        System.out.println(words);

        // Comparator<Student> comp = new Comparator<>() {
        //     public int compare(Student i, Student j) {
        //         if (i.age > j.age)
        //             return 1; // do swapping
        //         else
        //             return -1; // dont swap
        //     }
        // };

Comparator<Student> comp = (i, j) -> i.age>j.age?1:-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(35, "Elba"));
        studs.add(new Student(3, "Eva"));
        studs.add(new Student(39, "Sajan"));
        System.out.println(studs);

        Collections.sort(studs, comp); //using comparator
        //System.out.println(studs);

       // Collections.sort(studs); // using comparable interface
        System.out.println(studs);


    }
}
