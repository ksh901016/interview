package 간단한알고리즘_01;

import java.util.*;

public class Anagrams {
    final Map<String, List<String>> lookup = new HashMap<>(); // anagramList를 갖고 있다.

    public Anagrams(final List<String> words){
        for(final String word : words){
            final String signature = alphabetize(word);
            if(lookup.containsKey(signature)){
                lookup.get(signature).add(word);
            }else{
                final List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                lookup.put(signature, anagramList);
            }
        }
    }

    private String alphabetize(final String word){
        final byte[] bytes = word.getBytes();
        Arrays.sort(bytes);
        return new String(bytes);
    }

    public List<String> getAnagram(final String word){
        final String signature = alphabetize(word);
        final List<String> anagrams = lookup.get(signature);
        return anagrams == null ? new ArrayList<String>() : anagrams;
    }
}
