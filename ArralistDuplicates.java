import java.util.*;

public class ArralistDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6));

        // Print original list
        System.out.println("Original List: " + list);

        // Create a new HashSet from the list to remove duplicates
        Set<Integer> set = new HashSet<>(list);

        // Clear the list and add elements from the set (removes duplicates)
        list.clear();
        list.addAll(set);

        // Print the list after removing duplicates
        System.out.println("List After Removing Duplicates: " + list);
    }
}