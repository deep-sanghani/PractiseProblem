public class StackImplementation {
    static int[] arr = new int[100];
    static int start = -1;
    static int end = -1;

    static void display(){
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void push(int n){
        if(end==99){
            System.out.println("Not possible to push");
            return;
        }
        else if(start==-1 && end==-1){
            start = 0;
            arr[++end] = n;
        }
        else{
            arr[++end] = n;
        }
    }

    static void pop(){
        if(start==-1){
            System.out.println("Not possible to pop");
            return;
        }
        else if(start==end){
            arr[start]=0;
            start = -1;
            end = -1;
        }
        else{
            arr[end--] = 0;
        }
    }

    static int getMin() {
        if(start==-1 || end==-1){
            System.out.println("stack is empty not possible to get minimum number");
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        push(2);
        push(3);
        pop();
        getMin();
        push(1);
        getMin();
    }
}
