package kr.hs.dgsw.java.array;

import java.util.*;

public class MapStudy {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();

        map.put(2415, "조승완");
        map.put(2401, "김수인");
        map.put(2412, "이경민");
        map.put(2405, "김종윤");
        map.put(2406, "도현욱");

        String name = map.get(2401);
//        name = map.get(2402);

        map.put(2412, "윤석규");
//        name = map.get(2412);

        name = map.remove(2405);
//        System.out.println(name);

        // map에 들어가 있는 key의 목록

        System.out.println("[Key 목록]");
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println("\t" + key);
        }

        List<String> values = getValues(map);
        System.out.println(values);

        Collection<String> values2 = map.values();
    }

    public static List<String> getValues(Map<Integer, String> map) {
        List<String> values = new ArrayList<>();
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            values.add(map.get(key));
        }

        return values;
    }
}
