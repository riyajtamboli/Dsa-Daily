import java.util.HashSet;

public class _16SumPairOptimized {
    void main(){
        int arr [] = {2, 4, 3, 5, 7, 8, -1};  
        findPair(7, arr);
    }

    public static void findPair(int sum, int arr[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int num : arr){
            int needed = sum - num;

            if(hs.contains(needed)){
                System.out.println("(" + needed +", "+num +")");
            }

            hs.add(num);
        }
    }
}
