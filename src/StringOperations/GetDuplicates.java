package StringOperations;

import java.util.Objects;

public class GetDuplicates {
    public static String getDuplicates(String [] words){
        String duplicate = "";
        for (int i = 0; i <= words.length-1; i++){
            for (int j = i+1; j <= words.length-1; j++){
                if (Objects.equals(words[i], words[j])){
                    duplicate = words[i];
                    System.out.println(duplicate);
                }
            }
        }
       return "";
    }
}
