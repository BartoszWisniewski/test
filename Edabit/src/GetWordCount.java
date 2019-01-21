public class GetWordCount {
    public static void main(String[] args) {
        String s ="Just an example here move along";
        System.out.println(countWords(s));
    }
    public static int countWords(String s) {
        String[] stringTable = s.split(" ");
        return stringTable.length;
    }
}
