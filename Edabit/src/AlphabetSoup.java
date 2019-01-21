import java.util.Arrays;

public class AlphabetSoup {
    public static void main(String[] args) {
        String s ="javascript";
        System.out.println(AlphabetSoup(s));
    }
    public static String AlphabetSoup(String s) {
        char[] tableString = s.toCharArray();
         Arrays.sort(tableString);
         return String.valueOf(tableString);
    }
}
