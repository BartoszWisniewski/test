public class PhoneNumberFormatting {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(formatPhoneNumber(nums));
    }

    public static String formatPhoneNumber(int[] nums) {
        String number = "("+nums[0]+nums[1]+nums[2]+") "+nums[3]+nums[4]+nums[5]+"-"+nums[6]+nums[7]+nums[8]+nums[9];
        return number;
    }
}
