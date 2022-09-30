import java.util.*;

public class Problem4 {
    static int minswaps(List<Integer> arr){
        //nums will store all the elements in arr in sorted form
        List<Integer> nums = new ArrayList<>();
        nums.addAll(arr);
        int n = arr.size();
        //ans will store number of swaps required
        int ans = 0;
        Collections.sort(nums);
        for (int i = 0; i < n/2; i++) {
            //if element in sorted array is not equal to given array then ans will increment
            if(arr.get(i)!=nums.get(i)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        Given an array of n distinct elements. Find the minimum number of swaps required to sort the
//        array in strictly increasing order
//        int[] arr = {10, 19, 6, 3, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers, with 0 to end");
        List<Integer> arr = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            arr.add(input);
        }
        int ans = minswaps(arr);
        System.out.println(ans);
    }
}
