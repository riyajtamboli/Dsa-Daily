public class _03SumAll {
    void main(){
        int arr[]= {2,5,1,7,4,3};
        int sum = 0;
        for(Integer num : arr){
            sum += num;
        }

        System.out.println(sum);
    }
}
