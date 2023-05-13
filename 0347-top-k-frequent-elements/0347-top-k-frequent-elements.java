class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (buckets[map.get(key)] == null) {
                buckets[map.get(key)] = new ArrayList();
            }
            buckets[map.get(key)].add(key);
            }   
        for (int i = buckets.length - 1; res.size() < k && i > 0; i--) {
            if (buckets[i] != null) {
                res.addAll(buckets[i]);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
        }
}
