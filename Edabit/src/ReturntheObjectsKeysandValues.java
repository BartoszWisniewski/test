import java.util.*;

public class ReturntheObjectsKeysandValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        String aa = Arrays.toString(getValues(map));
        System.out.println(aa);


    }
    public static String[] getValues(Map<String,String> dict) {

        String[] result = dict.values().toArray(new String[dict.size()]);
        return result;


    }
}
