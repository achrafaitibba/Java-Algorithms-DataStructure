package ma.HamzaBekkaoui.ProblemSolving.ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean ValidAnagramUsingSort(String firstWord , String secondWord){

        if(firstWord.length() != secondWord.length())
            return false;

        char[] arrayForTheFirstWord = firstWord.toCharArray();
        char[] arrayForTheSecondWord = secondWord.toCharArray();

        Arrays.sort(arrayForTheFirstWord);
        Arrays.sort(arrayForTheSecondWord);

        String sortedFirstWord = new String(arrayForTheFirstWord);
        String sortedSecondWord = new String(arrayForTheSecondWord);

        if(sortedFirstWord.equals(sortedSecondWord))
            return true;

        return false;

    }

    public static boolean ValidAnagramUsingHashMap(String firstWord , String secondWord) {

        if(firstWord.length() != secondWord.length())
            return false;

        Map<Character, Integer> fistContainerOfCharacters = savingCharactersInAContainer(firstWord);
        Map<Character, Integer> secondContainerOfCharacters = savingCharactersInAContainer(secondWord);

        return fistContainerOfCharacters.equals(secondContainerOfCharacters);

    }


    public static  Map<Character , Integer> savingCharactersInAContainer(String word){
        Map<Character , Integer> container = new HashMap<>();
        for (Character character : word.toCharArray() ){
            if(container.containsKey(character)){
                container.put(character, container.get(character) + 1);
                continue;
            }
            container.put(character,0);
        }
        return container;
    }

    public static <K, V> boolean compareValuesForSameKeys(Map<K, V> map1, Map<K, V> map2) {
        for (K key : map1.keySet()) {
            // Check if both maps contain the key and if the values are equal
            if (map2.containsKey(key)) {
                V value1 = map1.get(key);
                V value2 = map2.get(key);
                if (!value1.equals(value2)) {
                    return false; // Values for the same key do not match
                }
            }
        }
        return true; // All matching keys have the same values
    }
}
