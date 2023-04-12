package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    int totalPrice = 0;

    public int getCart(){
        return items.size();
    }

    public void addItem(Item item){
        for (Item i : items) {
            if(i.name == item.name){
                i.quantity++;
                int total = i.price * i.quantity;
                totalPrice += total;
            }else{
                int total = item.price * item.quantity;
                totalPrice += total;
                items.add(item);
            }
        }
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public int getQuantity(Item item){
        return item.quantity;
    }

    public List<String> itemizedList(List<Item> itemsArr){
        System.out.println(itemsArr);
        List<String> itemsList = new ArrayList<>();
        for (Item i : itemsArr) {
            String details = String.format("%s - $dx $%d",i.name, i.quantity, i.price);
            itemsList.add(details);
        }
        return itemsList;
    }
}
