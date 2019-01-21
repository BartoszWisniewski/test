public class PrzeszukiwanieTabeli {
    public static void main(String[] args) {

        int[] A = {2, 1, 3, 4, 5, -1};

        for(int i = 0; i < A.length; i ++){
            if(A[i] == -1){
                System.out.println(i+1);
            }
        }

    }
}
