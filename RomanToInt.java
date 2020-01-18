package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
{@link 'https://leetcode.com/problems/roman-to-integer/'
 */
class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";//"MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }
 
    /** 
     * @param roman string s 
     * @return numerical equivalent of s
     */
    public static int romanToInt(String s) {
        
        Map<Character,Integer> romanMap = new HashMap<>();
           romanMap.put('I', 1);
           romanMap.put('V', 5);
           romanMap.put('X', 10);
           romanMap.put('L', 50);
           romanMap.put('C', 100);
           romanMap.put('D', 500);
           romanMap.put('M', 1000);
           int sum = 0,i = 0,len = s.length()-1;
           char ch;
           for(i = len; i>=0;i--) {
               ch = s.charAt(i);
               if(i<len && isSpecialCase(ch, s.charAt(i+1))){
                   sum -= romanMap.get(ch);
               } else {
                   sum += romanMap.get(ch);
               }
           }
           romanMap = null;
           s =null;
           return sum;
       }
   
       private static boolean isSpecialCase(char currentChar, char succeedingChar) {
           if (currentChar == 'I' && (succeedingChar == 'V' || succeedingChar == 'X')) return true;
           if (currentChar == 'X' && (succeedingChar == 'L' || succeedingChar == 'C')) return true;
           if (currentChar == 'C' && (succeedingChar == 'D' || succeedingChar == 'M')) return true;
           return false;
       }
   }