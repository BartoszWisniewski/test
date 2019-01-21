public class alternates {
    public static void main(String[] args) {
//todo
        String s = "OMG!!! This website is awesome!!";

        System.out.println(alternatingCaps(s));

    }
    public static String alternatingCaps(String s) {

        char[] sChar = s.toCharArray();
        char[] newCharS = new char[sChar.length];

        for(int i = 0; i < sChar.length; i++){

            if(i%2==1){
              //  String a = sChar[i];
                newCharS[i] = sChar[i];
            }
        }
        String a = "aaa";
        return a;
    }
}
