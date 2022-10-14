public class DistanceBetweenIndex {
    static int finddistance(int[] a, int n, int x, int y) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            if(a[i]==x && first==-1){
                first = i;
            }
            else if(a[i]==y && second==-1){
                second = i;
            }
        }
        if(first==-1 || second==-1)
            return -1;
        return Math.abs(first-second);
    }

    public static void main(String[] args) {
        int N = 4;
        int A[] = {1,2,3,2};
        int x = 42, y = 12;
        int ans = finddistance(A,N,x,y);
        System.out.println(ans);
    }
}
