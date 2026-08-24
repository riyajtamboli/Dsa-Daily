public class _04Avg {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};
        int n = arr.length;
        int sum  = 0;
        for(Integer num : arr){
            sum += num;
        }

        float avg = sum / n;
        System.out.println(avg);
    }
}
