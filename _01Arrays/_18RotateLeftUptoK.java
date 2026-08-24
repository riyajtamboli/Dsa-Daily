import java.util.Arrays;

public class _18RotateLeftUptoK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        rotateLeft(2, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateLeft(int k, int arr[]){
        int n = arr.length-1;
        k = k % n;
        rotate(0, n, arr);
        rotate(0, k-1, arr);
        rotate(k, n, arr);
    }
    public static void rotate(int start, int end, int arr[]){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
    }
}
