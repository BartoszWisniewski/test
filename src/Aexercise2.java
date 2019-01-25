
import java.util.HashMap;
import java.util.Map;

public class Aexercise2 {
    public static void main(String[] args) {

        // String N = "13 DUP 4 POP 5 DUP DUP DUP + DUP + -";
        String N = "13 4 12 21 4 + + + +";
        System.out.println(solution(N));
    }

    public static int solution(String S) {
        // write your code in Java SE 8

        String[] stringArray = S.split(" ");
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        int score = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("\\d+")) {
                score++;
                result.put(score, Integer.valueOf(stringArray[i]));
            } else if (stringArray[i].equals("DUP")) {
                int c = result.get(score);
                score++;
                result.put(score, c);

            } else if (stringArray[i].equals("POP")) {
                result.remove(score);
                score--;
            } else if (stringArray[i].equals("+") & result.size() > 1) {
                int a = result.get(score) + result.get(score - 1);
                result.remove(score);
                result.remove(score - 1);
                score--;
                result.put(score, a);
            } else if (stringArray[i].equals("-") & result.size() > 1) {
                int a = result.get(score) - result.get(score - 1);
                result.remove(score);
                result.remove(score - 1);
                score--;
                result.put(score, a);
            } else {
                return -1;
            }
        }
        return result.get(score);

        //first solution
       /* String[] stringArray = S.split(" ");
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        int score = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].matches("\\d+")) {
                score++;
                result.put(score, Integer.valueOf(stringArray[i]));
            } else if (stringArray[i].equals("DUP")) {
                if (stringArray[i - 1].matches("\\d+")) {
                    score++;
                    result.put(score, Integer.valueOf(stringArray[i - 1]));
                } else {
                    int c = result.get(score);
                    score++;
                    result.put(score, c);
                }
            } else if (stringArray[i].equals("POP")) {
                result.remove(score);
                score--;
            } else if (stringArray[i].equals("+") & result.size() > 1) {

                int a = result.get(score);
                int b = result.get(score - 1);
                result.remove(score);
                result.remove(score - 1);
                score--;
                result.put(score, (a + b));
            } else if (stringArray[i].equals("-") & result.size() > 1) {
                int a = result.get(score);
                int b = result.get(score - 1);
                result.remove(score);
                result.remove(score - 1);
                score--;
                result.put(score, (a - b));
            } else {
                return -1;
            }
        }
        return result.get(score);*/
    }
}
