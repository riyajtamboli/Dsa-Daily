import java.util.Arrays;
import java.util.Comparator;

public class _14ThirdMaxUsingStream {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Integer third = Arrays.stream(arr).boxed().
        sorted(Comparator.reverseOrder()).skip(2).findFirst()
        .get();

        System.out.println(third);
    }
}
