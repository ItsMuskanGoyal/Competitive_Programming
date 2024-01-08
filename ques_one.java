import java.util.Arrays;

public class ques_one {

    public static int minOperations(int[] nums) {
        int steps = 0;
        int i = 0;

        while (i < nums.length) {
            int j = i + 1;
            int counter = 1;

            while (j < nums.length && nums[i] == nums[j]) {
                counter++;
                j++;
            }

            if (counter == 1 || counter % 3 != 0) {
                steps += counter / 3 + 1;
            } else {
                steps += counter / 3;
            }

            i = j;
        }
        return steps;
    }

    public static void main(String[] args) {
        int num[] = {2, 2, 2, 3, 3, 3, 3, 3, 4, 4};
        Arrays.sort(num);
        System.out.println(minOperations(num));
    }
}
