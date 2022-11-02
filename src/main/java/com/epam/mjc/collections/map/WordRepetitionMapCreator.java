package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if(sentence.isEmpty())return map;
        StringTokenizer tokens = new StringTokenizer(sentence.toLowerCase()," .,");
        while(tokens.hasMoreTokens()){
            map.merge(tokens.nextToken(),1,(k,v)->++v);
        }
        return map;
    }
}
