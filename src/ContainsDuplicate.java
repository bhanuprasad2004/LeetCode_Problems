import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6, 8};
        
        boolean result = values(arr);
        
        System.out.println(result);

        
    }
    public static boolean values(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
           // System.out.println("HashSet after adding : " + set);
        }
        // System.out.println("HashSet after adding : " + set);
        return false;
    }
}
