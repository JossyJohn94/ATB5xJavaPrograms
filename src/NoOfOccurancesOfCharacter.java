package src;
import java.util.HashMap;

import java.util.Map;

public class NoOfOccurancesOfCharacter {

    public static void GetCount(String name)

    {

        Map<Character, Integer> mapCount=new HashMap<>();

        char[] strArray=name.toCharArray();

        for(char c:strArray)

        {

            if(mapCount.containsKey(c))

            {

                mapCount.put(c, mapCount.get(c)+1);

            }

            else {

                mapCount.put(c, 1);

            }

        }

        System.out.println(mapCount);

    }

    public static void main(String[] args) {

        GetCount("Jossy");

        GetCount("tresdf");

    }

}
