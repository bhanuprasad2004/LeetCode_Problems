public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,10,6,7,4,8};
        int target = 9;
        twosum(arr, target);
    }
    public static void twosum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length;j++) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Indices: " + i + ", " + j);
                System.out.println("Elements are : " +arr[i] + "," +arr[j]+ " = "+ target);
                    return;
            }
        }
    }
       System.out.println("Elements Not found"); 
    }
}
