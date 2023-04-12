package com.example;

import static org.junit.Assert.assertEquals;

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
        Cart testCart = new Cart();
        Item item = new Item("Handbag", 10, false, 1);
        Item item2 = new Item("Handbag", 10, false, 1);
        cart.addItem(item);
        testCart.addItem(item2);

        //Execute
        int result = cart.getTotalPrice();
        int equals = cart.getTotalPrice();
        //Assert
        assertEquals(equals, result);
    }
}
