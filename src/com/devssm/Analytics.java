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
        return ordenarListaEnArreglo(longWords);
    }
    
    public static String[] masCorta(String sentence){
        String [] words = sentence.split(" |,");
        ArrayList<String> shortWords = new ArrayList<>();
        String shortest = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < shortest.length()){
                shortest = words[i];
            }
        }
        shortWords.add(shortest);
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == shortest.length() && !shortest.equals(words[i])){
                shortWords.add(words[i]);
            }
        }
        return ordenarListaEnArreglo(shortWords);
    }

    public static String [] ordenarListaEnArreglo(ArrayList<String> lista){
        Collections.sort(lista);
        return lista.toArray(new String[lista.size()]);
    }
}
