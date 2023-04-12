package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
    @Test
    public void emptyCartTest(){
        //Setup
        Cart cart = new Cart();
        //Execute
        int result = cart.getCart();
        //Assert
        assertEquals(0, result);
    }

    @Test
    public void totalPriceTest(){
        //Setup
        Cart cart = new Cart();
        Item item = new Item("Handbag", 10, false, 1);
        cart.addItem(item);
    

        //Execute
        int result = cart.getTotalPrice();
        //Assert
        assertEquals(10, result);
    }

    @Test
    public void quantityAdditionTest(){
        //Setup
        Cart cart = new Cart();
        Item item = new Item("Handbag", 10, false, 1);
        cart.addItem(item);
        cart.addItem(item);
        //Execute
        int result = cart.getQuantity(item);
        //Assert
        assertEquals(2, result);
    }

    @Test
    public void itemizedListTest(){
        //Setup
        String[] expected = {"Handbag -x1 $10","Gum -x1 $25"};
        Cart cart = new Cart();
        Item item = new Item("Handbag", 10, false, 1);
        Item item2 = new Item("Gum", 25, false, 1);
        cart.addItem(item);
        cart.addItem(item2);
        //Execute
        String[] result = cart.itemizedList(item);
        //Assert
        Assert.assertArrayEquals(expected, result);
    }
}
