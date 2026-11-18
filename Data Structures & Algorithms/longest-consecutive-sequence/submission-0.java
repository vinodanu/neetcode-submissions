
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        int maxLength = 0;
        for(int num : nums) {

            if(!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}
