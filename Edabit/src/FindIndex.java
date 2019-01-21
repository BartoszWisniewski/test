public class FindIndex {
    public static void main(String[] args) {

        String[] arr = {"hi", "edabit", "fgh", "abc"};

        String str = "fgh";

        System.out.println(findIndex(arr,str));

    }
    public static int findIndex(String[] arr,String str) {
        int index =0 ;
        for(int i = 0; i < arr.length; i++)
            if(arr[i].equals(str)){
                return index = i;
            }
        return index;
    }
}
