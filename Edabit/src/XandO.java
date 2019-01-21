public class XandO {
    public static void main(String[] args) {
        String str = "ooxXm";
        System.out.println(getXO(str));

    }

    public static boolean getXO(String str) {

        char[] strChar = str.toLowerCase().toCharArray();
        int xLicznik = 0;
        int oLicznik = 0;
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == 'x') {
                xLicznik++;
            } else if (strChar[i] == 'o') {
                oLicznik++;
            }
        }
        if (xLicznik == oLicznik) {
            return true;
        } else {
            return false;
        }
    }
}
