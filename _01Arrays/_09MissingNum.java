public class _09MissingNum {
    public static void main(String[] args) {
        
        int arr[]= {1,2,4,5};
        int n = arr.length+1;
        int actualSum = (n * (n+1))/2;
        int sum = 0;

        for(Integer num : arr){
            sum += num;
        }

        System.out.println("Missing Number : "+(actualSum-sum));

    }
}
