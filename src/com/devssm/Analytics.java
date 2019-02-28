package com.devssm;

import java.util.*;

public class Analytics {
    public static String[] masLarga(String sentence) {
        String [] words = sentence.split(" |,");
        ArrayList<String> longWords = new ArrayList<>();
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        longWords.add(longest);
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == longest.length() && !longest.equals(words[i])){
                longWords.add(words[i]);
            }
        }
        return longWords.toArray(new String[longWords.size()]);
    }
}
