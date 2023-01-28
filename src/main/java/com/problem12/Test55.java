package com.problem12;

import java.util.HashMap;
import java.util.Optional;

public class Test55 {
    public static void main(String[] args) {
        HashMap<Integer, Harrypotter> ht = new HashMap<>();

        ht.put(101, new Harrypotter(101, "해리", "포터"));
        ht.put(102, new Harrypotter(102, "론", "위즐리"));
        ht.put(103, new Harrypotter(103, "헤르미온느", "그레인져"));

        System.out.println("성\t\t\t이름");
        System.out.println("--------------------");
        System.out.println(ht.get(101).getFirstName() + "\t\t\t" + ht.get(101).getLastName());
        System.out.println(ht.get(102).getFirstName() + "\t\t\t" + ht.get(102).getLastName());
        System.out.println(ht.get(103).getFirstName() + "\t\t" + ht.get(103).getLastName());
    }
}
