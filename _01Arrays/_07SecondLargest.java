public class _07SecondLargest {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && first != second){
                second = arr[i];
            }
        }
        
        System.out.println(second);
    }
}
