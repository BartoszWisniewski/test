public class ATMPINCodeValidation {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(validatePIN(s));
    }
    public static boolean validatePIN(String s) {
        if(s.length() != 4 & s.length() != 6){
            return false;
        }else{
            String regex = "\\d+";
            return s.matches(regex);
        }
    }
}
