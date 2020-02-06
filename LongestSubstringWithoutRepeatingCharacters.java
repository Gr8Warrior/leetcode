package leetcode;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(" ");

        String s = " ";
        //String s = "pwwkew";
        //String s = "bbbbb";
        //String s = "abcabcbb";
        
        //String s = "abbb";
        
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int leftWindow = 0;
        int longest = 0;

        Map<Character,Integer> charMap = new HashMap<Character,Integer>();

        for (int rightWindow = 0; rightWindow < s.length();) {

            if(!charMap.containsKey(s.charAt(rightWindow))){
                charMap.put(s.charAt(rightWindow), 0);
            }
            charMap.put(s.charAt(rightWindow), charMap.get(s.charAt(rightWindow))+1);

            //System.out.println(charMap.values().stream().anyMatch(e -> e>1));
            if(charMap.values().stream().anyMatch(e->e>1) ){
                charMap.put(s.charAt(leftWindow), charMap.get(s.charAt(leftWindow))-1);
                leftWindow += 1;
            }

            longest = Math.max(longest, rightWindow - leftWindow +1);
            rightWindow += 1;
        }
        return longest;
    }
}