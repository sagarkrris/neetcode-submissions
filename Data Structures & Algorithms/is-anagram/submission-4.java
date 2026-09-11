class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            countMap.merge(s.charAt(i), 1,Integer::sum);
            countMap.merge(t.charAt(i), -1, Integer::sum);
        }
        for(int value :  countMap.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
