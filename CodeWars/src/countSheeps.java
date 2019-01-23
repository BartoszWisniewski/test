
public class countSheeps {
    public static void main(String[] args) {
        Boolean[] array1 = {null,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  null };
        System.out.println(countSheeps1(array1));
    }
    public static int countSheeps1(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int counter = 0;
        for(int i = 0; i< arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] != null & arrayOfSheeps[i].equals(true)){
                counter++;
            }
        }
        return counter;
    }

}
