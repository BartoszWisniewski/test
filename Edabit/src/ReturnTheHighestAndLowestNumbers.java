import java.util.Arrays;

public class ReturnTheHighestAndLowestNumbers {
    public static void main(String[] args) {
        String s = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";
        System.out.println(highLow(s));
    }
    public static String highLow(String s) {
        String[] tableString = s.split(" ");
        int[] tableInteger = new int[tableString.length];
        for(int i =0; i < tableString.length; i++){
            tableInteger[i]= Integer.valueOf(tableString[i]);
        }
        int max = Arrays.stream(tableInteger).max().getAsInt();
        int min = Arrays.stream(tableInteger).min().getAsInt();
        return max+" " + min;
    }
}
