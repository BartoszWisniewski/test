public class ReverseTheOrderOfAString {
    public static void main(String[] args) {
        String str = "Innovation is the ability to see change as an opportunity - not a threat";
        System.out.println(reverse(str));
    }
    public static String reverse(final String str) {
        char[] newStr = str.toCharArray();
        char[] result = new char[newStr.length];
        for (int i = 0; i < newStr.length; i ++){
            result[result.length-1-i] = newStr[i];
        }
        return String.valueOf(result);
    }
}
