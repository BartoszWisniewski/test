import java.util.Arrays;

public class Ex2 {
    /*

     */
    public static void main(String[] args) {
        int[] rank = {3, 4, 3, 0, 2, 2, 3, 0, 5, 0};
        System.out.println(solution(rank));

    }

    public static int solution(int[] ranks) {
        int score = 0;

        for (int i = 0; i < ranks.length; i++) {
            int finalI = ranks[i] + 1;
            if (Arrays.stream(ranks).anyMatch(s -> s == finalI)) {
                score++;
            }
        }

        return score;
    }
}
