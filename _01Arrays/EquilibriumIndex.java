public class EquilibriumIndex {
    void main(){
        
       int arr[] =  {1, 3, 5, 2, 2};

       int totalSum = 0;

       for(int num : arr){
        totalSum+= num;
       }

       int leftSum = 0;

       for(int i=0; i<arr.length; i++){
            totalSum -= arr[i];

            if(totalSum == leftSum){
                System.out.println(i);
            }

            leftSum += arr[i];
       }
    }
}
