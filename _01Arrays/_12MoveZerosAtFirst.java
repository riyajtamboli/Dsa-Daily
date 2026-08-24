
import java.util.Arrays;

public class _12MoveZerosAtFirst {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,4,5};

        int j=arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j--;
            }
        }
        System.out.println(j);
        
        while(j >= 0){
            arr[j] = 0;
            j--;
        }

        System.out.println(j);

        System.out.println(Arrays.toString(arr));
    }
}
