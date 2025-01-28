import java.util.HashMap;

public class ContainsDuplicates2 {

    public static void main(String[] args) {
        int[] arr = {1,6,3,4,6,8};
        int k = 3;
        boolean result = values(arr, k);
        System.out.println(result);
    }
    public static boolean values(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prev = map.get(arr[i]);
                if (i - prev <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);

        }
        return false;
    }
}