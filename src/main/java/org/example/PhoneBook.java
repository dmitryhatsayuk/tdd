package org.example;

import java.util.HashMap;

public class PhoneBook {
    private static HashMap<Integer,String> book;
    public int add (int number,String name){
        if (book==null){
            book = new HashMap<>();
        }
        book.put(number,name);
        return number;
    }
    public String findByNumber (Integer number){
        if (book == null){
            System.out.println("Телефонная книга пуста");
        }
         return book.get(number);
    }
}
