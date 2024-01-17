package Strings_Numbers_Math;

import java.util.HashMap;

//Подсчет повторяющихся символов. Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
public class Task1 {

    public static HashMap<Character, String> repeatedCharacters(String string){
        HashMap<Character, Integer> mapOfChars = new HashMap<>();
        char [] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(mapOfChars.containsKey(chars[i])){
                mapOfChars.put(chars[i], mapOfChars.get(chars[i])+1);
            }
            else {
                (mapOfChars.put(chars[i],1));
            }
        }
        
    }
}
