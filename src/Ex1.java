import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex1 {
    /*

    */
    public static void main(String[] args) {

        int[] A = {3,5,1};
        System.out.println(solution(A));


    }
    public static int solution(int[] A) {
        int value = 0;
        for (int i =0; i< A.length; i++){
            double a = Math.pow(10, i);
            value += A[i] * a;
        }
       // String sumString = String.valueOf(value*17);
        char[] charArray = String.valueOf(value*17).toCharArray();
        int result =0;
        for(int j = 0 ; j< charArray.length; j++){
            result += Character.getNumericValue(charArray[j]);
        }
        return result;



      //  Arrays.stream(A).collect(Collectors.t)


    /*    String stringA = "";
        for (int i =0; i< A.length; i++){
            stringA += String.valueOf(A[A.length-1-i]);
        }
       int newA = Integer.parseInt(stringA);
        int sum = 17*newA;
        String sumString = String.valueOf(sum);
        char[] charArray = sumString.toCharArray();
        int result =0;
        for(int j = 0 ; j< charArray.length; j++){
            result += Character.getNumericValue(charArray[j]);
        }*/
       // return result;
    }
}
