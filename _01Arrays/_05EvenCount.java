public class _05EvenCount {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};
        int even = 0;

        for(Integer num : arr){
            if(num % 2==0){
                even++;
            }
        }

        System.out.println(even);
    }
    
}
