package org.example;

import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String , Integer> book;
    public int add (String name,int number){
        if (book==null){
            book = new HashMap<>();
        }
        book.put(name,number);
        return number;
    }
}
