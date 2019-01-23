public class ReturntheMiddleCharacterofaString {
    public static void main(String[] args) {
        String s = "testing";
        System.out.println(getMiddle(s));
    }
    public static String getMiddle(String word) {

        if (word.length()%2==0){
            String result = word.subSequence(word.length()/2-1,word.length()/2+1).toString();
            return result;
        }else{
           String result =  word.subSequence(word.length()/2,word.length()/2+1).toString();
           return result;
        }
    }
}
