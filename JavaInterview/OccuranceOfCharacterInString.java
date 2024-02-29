package JavaInterview;

import java.util.HashMap;
import java.util.Map;


public class OccuranceOfCharacterInString {

    public static void Getcount(String name) {
        Map<Character, Integer> mapcount = new HashMap<>();

        char[] arr = name.toCharArray();
        for (char c : arr) {

            if(mapcount.containsKey(c))
            {
                mapcount.put(c, mapcount.get(c) + 1);
            }
            else {

               mapcount.put(c, 1);
            }



        }
        System.out.println("Count of string:" + mapcount);
    }

        public static void main(String[] args) {
            Getcount("Jerushaa");
        }
    }

