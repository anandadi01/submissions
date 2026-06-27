class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            // map.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (map.containsKey(number)) {
                return true;
            }
            map.put(number, 1);
        }
        return false;
    }
}