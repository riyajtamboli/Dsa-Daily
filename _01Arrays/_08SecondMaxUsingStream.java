import java.util.Arrays;
import java.util.Comparator;

public class _08SecondMaxUsingStream {
    public static void main(String[] args) {
        int arr[]= {2,5,1,7,4,3};

        int second = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);
    }
}
