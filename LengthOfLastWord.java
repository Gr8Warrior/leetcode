package leetcode;

class LengthOfLastWord {
    public static void main(String[] args) {

        String s = " ";
        System.out.println(lengthOfLastWord(s));        
    }

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        if(s.length() <= 1) return s.length();
        return s.length() - (s.lastIndexOf(' ')+1);

        // String arr[] = s.split(" ");
        // return ((arr.length ==0)?0:arr[arr.length-1].length());
        
        
    }
}