public class _13ThirdMax {
    void main() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > first && first != second && second != third) {
                third = arr[i];
            }
        }

        System.out.println(third);
    }

}