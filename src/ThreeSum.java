

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1,0,2,-1,3,-2};
        threesum(arr);
    }
    public static void threesum(int[] arr) {
        for (int i = 0; i <= arr.length -3 ; i++) {
            
            for (int j = 0; j <= arr.length - 2;j++) {
                
                for (int k = 0; k <= arr.length-1; k++) {
                    
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Found threesum the elements are : "+arr[i]+","+ arr[j]+","+ arr[k]);
                        return;
                    }
                }
            }
        }
        System.out.println("Not found");        
    }
}

// public class ThreeSum {
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, -1, 3, -2};
//         threesum(arr);
//     }

//     public static void threesum(int[] arr) {
//         // Loop through each triplet in the array
//         for (int i = 0; i < arr.length - 2; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     // Check if the sum of the three elements is zero
//                     if (arr[i] + arr[j] + arr[k] == 0) {
//                         System.out.println("Three numbers found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
//                         return; // Exit after finding one triplet
//                     }
//                 }
//             }
//         }
//         System.out.println("No three numbers found with a sum of zero.");
//     }
// }
