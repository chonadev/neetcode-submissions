class Solution {
    public boolean isAnagram(String s, String t) {
        if(sortedStr(s).equals(sortedStr(t))){
            return true;
        }
        return false;
    }
    public String sortedStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
