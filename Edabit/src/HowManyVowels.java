public class HowManyVowels {
    public static void main(String[] args) {
        String s = "Celebration";
        System.out.println(getCount(s));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] tabelString = str.toCharArray();
        for(int i = 0; i < tabelString.length; i++){
            if(tabelString[i] == 'a'){
                vowelsCount++;
            }else if(tabelString[i] == 'e'){
                vowelsCount++;
            }else if(tabelString[i] == 'i'){
                vowelsCount++;
            }else if(tabelString[i] == 'o'){
                vowelsCount++;
            }else if(tabelString[i] == 'u'){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
