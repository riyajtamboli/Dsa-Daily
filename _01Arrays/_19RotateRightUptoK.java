import java.util.Arrays;

public class _19RotateRightUptoK {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        rotateRight(2, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateRight(int k, int []arr){
        int n = arr.length-1;
        k = k % n;
        rotate(0, n, arr);
        rotate(0, k-1, arr);
        rotate(k, n, arr);
    }
    public static void rotate(int start, int end, int arr[]){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
