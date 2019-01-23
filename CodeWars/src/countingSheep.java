public class countingSheep {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(countingSheep(num));

    }
    public static String countingSheep(int num) {
        String result = "";
        for(int i =1; i <= num; i++){
            result += i + " sheep...";
        }
        //Add your code here
        return result;
    }
}
