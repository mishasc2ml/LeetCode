class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] array = new char[26];
            for (char ch : strs[i].toCharArray()) {
                array[ch - 'a']++;
            }
            String res = String.valueOf(array);
            if (!map.containsKey(res)) {
                map.put(res, new ArrayList<>());
            }
            map.get(res).add(strs[i]);
            }
            return new ArrayList<>(map.values());
        }
}
