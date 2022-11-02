package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()) {
            hashMap.merge(entry.getValue(), entry.getKey(), (k, v)-> entry.getKey()<v? entry.getKey() : v);
        }
        return hashMap;
    }
}
