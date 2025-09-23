import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 6, 2); // a way to add values to a list using Arrays class

        // Consumer<Integer> com = new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        //nums.forEach(com);

        //OR
            

        nums.forEach(n -> System.out.println(n));
    }
}
