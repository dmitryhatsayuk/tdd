package org.example;

import java.util.*;

public class PhoneBook {
    private  HashMap<Integer,String> book;
    public int add (int number,String name){
        if (book==null){
            book = new HashMap<>();
        }
        book.put(number,name);
        return number;
    }
    public String findByNumber (Integer number) {

        String result = null;
        if (book == null) {
            System.out.println("Телефонная книга пуста");
        } else if (!book.containsKey(number)) {
            System.out.println("номер не найден");
        } else {
            result = book.get(number);
        }
        return result;
    }
    public int findByName(String name) {
        int res = 0;
        if (book == null) {
            System.out.println("Телефонная книга пуста");
        } else if (!book.containsValue(name)) {
            System.out.println("Имя не найдено");
        } else {
            for (int i = 0; i < book.size(); i++) {
                Optional<Integer> result = book.entrySet()
                        .stream()
                        .filter(entry -> name.equals(entry.getValue()))
                        .map(Map.Entry::getKey)
                        .findFirst();

                if (result.isPresent()) {
                    res = result.get();
                }
            }
        }
        return res;
    }
    public String printAllNames (){
        HashMap<Integer, String> result = new LinkedHashMap<>();
       book.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e ->result.put(e.getKey(),e.getValue()));
        return result.values().toString();
        
    }

}
