class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            System.out.println("Not anagram");
        }
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        return false;
    }
}