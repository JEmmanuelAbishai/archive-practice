class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> val = new HashMap<>();
        for(String a : strs){
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            val.putIfAbsent(key, new ArrayList<>());

            val.get(key).add(a);
        }

        return new ArrayList<>(val.values());
    }
}