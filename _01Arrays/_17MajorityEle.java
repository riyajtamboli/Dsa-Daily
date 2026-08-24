import java.util.HashMap;
import java.util.Map;

public class _17MajorityEle {
    void main(){
        int arr[] = {1,2,3,2,3,4,2};
        majorityEle(arr);
    }

    public static void majorityEle(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        int n = arr.length / 2;

        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() >= n){
                System.out.println(e.getKey());
            }
        }
    }
}
