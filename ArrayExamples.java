import tester.*;

class ArrayExamples {
    // EXAM: Write your methods here

    int find(int[] nums, int n) {
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] == n) {
                return i;
            }
        }
        return -1;
    }

    /*
        EXAM: Write the sentence here
    */
    int[] mystery(int[] nums, int n) {
        int index = find(nums, n);
        int[] result = new int[index];
        for (int i = 0; i < index; i += 1) {
            result[i] = nums[i];
        }
        return result;
    }

    // EXAM: Write the test here    
}