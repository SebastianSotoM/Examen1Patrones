package com.devssm;

import java.util.*;

public class Analytics {
    public static String[] masLargaOrdenada(String sentence) {
        ArrayList<String>lista = masLarga(sentence);
        Collections.sort(lista);
        return fromListToArray(lista);
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
        Collections.sort(shortWords);
        return fromListToArray(shortWords);
    }

    public static ArrayList<String> masLarga(String sentence){
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
        return longWords;
    }

    public static String primeraMasLarga(String sentence){
        return fromListToArray(masLarga(sentence))[0];
    }

    public static String [] fromListToArray(ArrayList<String> lista){
        return lista.toArray(new String[lista.size()]);
    }
}
