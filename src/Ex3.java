public class Ex3 {
    /*

    */
    public static void main(String[] args) {
        int a =5;
        int b = 3;

        System.out.println(solution(a,b));
        }

    public static String solution(int A, int B) {
        int intA= A;
        int intB= B;
        String result= "";
        //int sum = intA + intB;
        while((intA + intB > 0)) {
            if (intA >= 2 & !result.endsWith("a")) {
                result += "aa";
                intA -= 2;
            } else if (intB >= 2 & !result.endsWith("b")) {
                result += "bb";
                intB -= 2;
            } else if (intA == 1 & !result.endsWith("a")) {
                result += "a";
                intA -= 1;
            } else if (intB == 1 & !result.endsWith("b")) {
                result += 'b';
                intB -= 1;
            }
        }
        return result;
    }
}
