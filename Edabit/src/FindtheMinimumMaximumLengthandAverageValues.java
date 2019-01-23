import java.util.Arrays;

public class FindtheMinimumMaximumLengthandAverageValues {
    public static void main(String[] args) {
        double[] s = {6, 9, 15, -2, 92, 11};
        String resultString = Arrays.toString(minMaxLengthAverage(s));
        System.out.println(resultString);
    }
    public static double[] minMaxLengthAverage(double[] nums) {
        double[] result = new double[4];
        result[0] = Arrays.stream(nums).min().getAsDouble();
        result[1] = Arrays.stream(nums).max().getAsDouble();
        result[2] = nums.length;
        result[3] = Arrays.stream(nums).average().getAsDouble();
        return result;
    }
}
