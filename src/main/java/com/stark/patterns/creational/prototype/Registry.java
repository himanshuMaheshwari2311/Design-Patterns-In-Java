package com.stark.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try{
            item = (Item) (items.get(type)).clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    public void loadItems(){
        Movie movie = new Movie();
        movie.setRuntime("2 hours");
        movie.setPrice(24.99);
        movie.setTitle("Avengers");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setTitle("RDPD");
        book.setPrice(19.99);
        items.put("Book", book);
    }
}
