package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();

    public int getCart(){
        return items.size();
    }
}
