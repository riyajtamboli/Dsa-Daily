public class _15SumPair {
    public static void main(String[] args) {
        int arr [] = {2, 4, 3, 5, 7, 8, -1};  
        findPair(7, arr);
    }

    public static void findPair(int sum, int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+ ", "+arr[j]+")");
                }
            }
        }
    }
}
