import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Main class
public class sortTest {

    // Main driver method
    @Test
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.printf("Original arr[] : %s",
                Arrays.toString(arr));

        // Calling the sort() method present
        // inside Arrays class
        Arrays.sort(arr);

        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }

    @Test
    public static void removeDuplicate(){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arrFinal = {};
        int j = 0;
        for (int i=0;i<nums.length;i++){
            //System.out.println(nums[i]);
            if (!Arrays.asList(arrFinal).contains(nums[i])) {
                List arrList = new ArrayList( Arrays.asList(arrFinal));
                arrList.add(nums[i]);
            }
        }
        System.out.println(Arrays.asList(arrFinal));
    }
}