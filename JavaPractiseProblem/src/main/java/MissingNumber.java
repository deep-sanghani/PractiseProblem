import java.util.Arrays;

public class MissingNumber {
    static int minmisnumber(int[] a, int n) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=i+1)
                return i+1;
        }
        return -1;
    }

    static int minmisnumber2(int[] a, int n) {
        int sum=0;
        sum = (n * (n+1))/2;
        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 10;
        int[] A = {6,1,2,8,3,4,7,10,5};
        int ans = minmisnumber2(A,N);
        System.out.println(ans);
    }
}
