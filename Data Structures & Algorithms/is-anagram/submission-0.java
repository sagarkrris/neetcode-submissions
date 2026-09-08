class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChArr = s.toCharArray();
        char[] tChArr = t.toCharArray();
        Arrays.sort(sChArr);
        Arrays.sort(tChArr);
        return Arrays.equals(sChArr, tChArr);
    }
}
