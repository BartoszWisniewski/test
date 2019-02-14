import java.util.Arrays;

public class Aexercise3 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int N = 4845;
        System.out.println(solution(N));
        System.out.println("Time: "+(System.nanoTime()-start));
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        int[] intTab = String.valueOf(N)
                .chars()
                .map(Character::getNumericValue)
                .sorted()
                .toArray();
        String newString = "";
        /*for (int i : intTab) {
            newString = i + newString;
        }*/


        StringBuffer strB = new StringBuffer(newString);
        for (int i = intTab.length-1; i >= 0; i--) {
            strB.append(intTab[i]);
        }
        newString = strB.toString();


        int result = Integer.valueOf(newString);

        //first solution
        /*String strN = String.valueOf(N);
        char[] nChar = strN.toCharArray();
        int[] newIntArray = new int[nChar.length];
        for (int i = 0; i < nChar.length; i++) {
            newIntArray[i] = Character.getNumericValue(nChar[i]);
        }
        Arrays.sort(newIntArray);
        String resultString = "";
        for (int j = 0; j < newIntArray.length; j++) {
            resultString += newIntArray[newIntArray.length - 1 - j];
        }
        int result = Integer.valueOf(resultString);*/

        if (result > 100000000) {
            return -1;
        } else
            return result;
    }
}
