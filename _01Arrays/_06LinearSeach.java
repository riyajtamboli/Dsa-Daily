public class _06LinearSeach {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};
        int index = linearSeach(9, arr);
        if(index == -1){
            System.out.println("Key is not found");
        }else{
            System.out.println("Key is present at index : "+index);
        }
    }

    public static int linearSeach(int key, int arr[]){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }


        return -1;
    }
}
