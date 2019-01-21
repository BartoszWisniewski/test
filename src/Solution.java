import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 3, 4, 5, -1};
        System.out.println("aaa " + solution(A));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] newA = Arrays.stream(A).distinct().sorted().toArray();
        int found = 1;
        for (int i = 0; i < newA.length; i++) {
            if (newA[i] == found) {
                found++;
            }
        }
        return found;
    }
}

