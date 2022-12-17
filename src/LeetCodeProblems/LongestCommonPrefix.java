package LeetCodeProblems;

import java.util.Objects;

public class LongestCommonPrefix{
   public static String longestCommonPrefix(String [] words){
       if (words.length == 0) return "";
       String prefix = words[0];

       for (int i = 0; i <= words.length-1; i++){
           while (words[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0,prefix.length()-1);
           }
       }
       return prefix;
   }
}
