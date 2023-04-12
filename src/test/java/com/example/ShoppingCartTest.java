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
}
