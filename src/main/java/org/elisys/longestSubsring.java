package org.elisys;

import java.util.HashSet;

public class longestSubsring {
    public static void main(String[] args) {
        System.out.println(findLongestSubsring("abcdbfg"));
    }
    public static  int findLongestSubsring(String string){
        HashSet<Character> chars = new HashSet<>();
        int maxLength = 0;
        int left =0;
        int startIndexOfTheRestult=0;
        for (int i = 0; i < string.length(); i++){

            if (chars.contains(string.charAt(i))){
                while (chars.contains(string.charAt(i))){
                    chars.remove(string.charAt(left));
                    left++;
                }
            }
            chars.add(string.charAt(i));

            if(i-left+1 >maxLength)
            {
                maxLength=i-left+1; //maxLength=Math.max(maxLength,chars.size)
                startIndexOfTheRestult=left;

            }


        }
        System.out.println(string.substring(startIndexOfTheRestult,startIndexOfTheRestult+maxLength));
        return maxLength;

    }
}

// a b c d b c d        HHashSet =a,b,c,d
// left=1   , i=4 -> 4-1+1> right length

// 10^3 -> 2 loops o(n2)
// 10^4 ->  2 loops don't wo



