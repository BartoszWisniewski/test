public class ShuffleTheName {
    public static void main(String[] args) {

        String s = "Donald Trump";
        System.out.println(nameShuffle(s));

    }
    public static String nameShuffle(String s) {
        String[] newS = s.split(" ");
        return newS[1]+" "+newS[0];
    }
}
