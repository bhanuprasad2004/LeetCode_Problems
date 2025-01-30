public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,2,5,1};
        single(arr);

    }
    public static void single(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println(result);
    }
}


// import java.util.HashSet;

// public class SingleNumber {

//     public static void main(String[] args) {
//         int[] arr = {3,5,3,5,6};
//         search(arr);
//     }
//     public static void search(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int i = 0; i < arr.length; i++)
//         if (set.contains(arr[i])) {
//             set.remove(arr[i]);
//         } else {
//             set.add(arr[i]);
//         }
//         System.out.println(set);
//     }
// }
