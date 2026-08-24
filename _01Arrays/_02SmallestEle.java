public class _02SmallestEle {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};
        int min = Integer.MAX_VALUE;

        for(Integer num : arr){
            if(num < min){
                min = num;
            }
        }

        System.out.println(min);
    }
}
