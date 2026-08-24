
public class _01LargestEle {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};
        int max = Integer.MIN_VALUE;

        for(Integer num : arr){
            if(max < num){
                max = num;
            }
        }

        System.out.println(max);
    }
}
