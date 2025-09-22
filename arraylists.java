import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class arraylists {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(7);
        System.out.println(nums);

        for (int n : nums) {
            System.out.println(n);
        }
        // use a List instead of Collection if you want to use index values
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(2);
        nums1.add(1);
        nums1.add(3);
        nums1.add(3);

        for (int i = 0; i < nums1.size(); i++) {
            System.out.println(nums1.get(i));
        }

        // use a Set if no duplicate values should be there, no index for set
        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(2);
        nums2.add(1);
        nums2.add(3);
        nums2.add(3);

        for (int n : nums2) {
            System.out.println(n);
        }

         // use a TreeSet for sorted values
        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(22);
        nums3.add(51);
        nums3.add(83);
        nums3.add(83);

        // for (int n : nums3) {
        //     System.out.println(n);
        // }
        //OR

        Iterator<Integer> values = nums3.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
