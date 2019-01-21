import java.util.Arrays;

public class SortNumbersInAscendingOrder {
    public static void main(String[] args) {
        int[] tableInteger = {1, 2, 10, 50, 5};
        String result = Arrays.toString(sortNumsAscending(tableInteger));
        System.out.println(result);
    }
    public static int[] sortNumsAscending(int[] nums) {
        int[] sortedTable = Arrays.stream(nums).sorted().toArray();
        return sortedTable;
    }
}
