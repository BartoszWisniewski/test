
public class DNAtoRNAConversion {
    public static void main(String[] args) {
       // String dna = "GCAU";
        String dna = "TTTT";
        System.out.println(dnaToRna(dna));

    }
    public static String dnaToRna(String dna) {
      /*  char[] charDNA = dna.toCharArray();
        char[] newCharDNA = new char[charDNA.length];
        for(int i = 0; i < charDNA.length; i++ ){
            if(charDNA[i] =='T'){
                newCharDNA[i] = 'U';
            }else{
                newCharDNA[i] = charDNA[i];
            }
        }String result = String.valueOf(newCharDNA);*/

      String result = dna.replaceAll("T", "U");
            return result;  // Do your magic!
    }
}
