import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Harsh", 92);

        System.out.println(students);

        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
    }
}
