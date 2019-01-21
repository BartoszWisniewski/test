public class ReturnTheFourLetterStrings {
    //todo
    public static void main(String[] args) {
        String[] tableString = {"Ryan", "Kieran", "Jason", "Matt"};
        System.out.println(isFourLetters(tableString).toString());
    }
    public static String[] isFourLetters(String[] s) {
        int newLengthArray;
        for(int i =0; i < s.length; i++){
            newLengthArray=0;
            if(s[i].length()==4){
                newLengthArray++;
            }
        }

        for(int j =0; j< s.length; j++){
            String[] newStringArray = new String[newLengthArray];
            for(int k =0; k< newLengthArray; k++)
                if(s[j].length()==4){
                    newStringArray[k] = s[j];
                }return newStringArray;
        }
    }
}