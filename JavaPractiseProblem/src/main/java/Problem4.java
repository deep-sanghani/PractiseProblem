import java.util.*;

public class Problem4 {
    static int minswaps(List<Integer> arr){
        List<Integer> nums = new ArrayList<>();
        nums.addAll(arr);
        int n = arr.size();
        int ans = 0;
        Collections.sort(arr);
        for (int i = 0; i < n/2; i++) {
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
