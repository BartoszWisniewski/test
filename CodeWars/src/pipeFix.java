import java.util.Arrays;

public class pipeFix {
    public static void main(String[] args) {
       // int[] numbers = {1,2,3,5,6,8,9};
        int[] numbers = {6,9};
        String res = Arrays.toString(pipeFix1(numbers));
        System.out.println(res);
    }
    public static int[] pipeFix1(int[] numbers) {
        // Fix the pipes!
        int size = numbers[numbers.length-1]-numbers[0];
        int[] result = new int[size+1];
        for(int i = 0; i < result.length; i++){
            result[i] = numbers[0]+i;
        }
        return result;
    }
}
