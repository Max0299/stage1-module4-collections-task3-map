package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        String str = sentence.toLowerCase();

        String[] array = str.split("\\W+");

        for (String string : array) {
            for (String string1 : array) {
                if (string.equals(string1)) {
                    count++;
                }
            }
            map.put(string, count);
            count = 0;
        }
        return map;
    }
}
