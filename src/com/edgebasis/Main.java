package com.edgebasis;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String inputString = "ate eat tan bat ant";
        String[] strs = inputString.split(" ");
        Map<String, List<String>> group = new HashMap<String, List<String>>();

        if(strs == null || strs.length ==0) {
            System.out.println(new ArrayList<List<String>>());
        }
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            if(!group.containsKey(String.valueOf(charArray))){
                group.put(String.valueOf(charArray), new ArrayList<String>());
                group.get(String.valueOf(charArray)).add(s);
            }else{
                group.get(String.valueOf(charArray)).add(s);
            }


        }

        System.out.println(group);
        System.out.println(new ArrayList<List<String>>(group.values()));





    }

}
