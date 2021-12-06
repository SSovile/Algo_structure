package com.company;

import java.util.*;

class Whain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int res = 0;

        Map<String, Integer> temp = new HashMap<>();

        for(String word : words) {

            temp.put(word, 1);
            for(int i = 0; i < word.length(); i++) {
                StringBuilder current = new StringBuilder(word);
                String next = current.deleteCharAt(i).toString();
                if(temp.containsKey(next)) {
                    temp.put(word, Math.max(temp.get(word), temp.get(next)+1));

                }
            }

            res = Math.max(res, temp.get(word));
        }

        return res;
    }
}