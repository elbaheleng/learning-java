import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 6, 2); // a way to add values to a list using Arrays class
    //  Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n*2);
    // int result = s3.reduce(0,(curr,eval)-> curr + eval);

    int result = nums.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0,(curr,eval)-> curr + eval);
    System.out.println(result); 
    }
    

}
