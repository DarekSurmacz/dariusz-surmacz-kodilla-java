package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.SESAME)
                .sauce(Sauce.STANDARD)
                .burgers(3)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.CHILLI_PEPPER)
                .ingredient(Ingredients.PICKLES)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.SALAD)
                .ingredient(Ingredients.MUSHROOMS)
                .ingredient(Ingredients.SHRIMP)
                .build();
        System.out.println(bigmac);

        //When & Then
        assertEquals(Bun.SESAME, bigmac.getBun());
        assertEquals(Sauce.STANDARD, bigmac.getSauce());
        assertEquals(3, bigmac.getBurgers());
        assertEquals(8, bigmac.getIngredients().size());
    }

}