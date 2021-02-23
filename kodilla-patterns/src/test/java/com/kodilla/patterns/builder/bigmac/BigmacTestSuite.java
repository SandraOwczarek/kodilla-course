package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesam Seed bun")
                .burgers(3)
                .ingredient("iceberg lettuce")
                .sauce("Thousand Island Dressing")
                .ingredient("becon")
                .ingredient("pickles")
                .ingredient("onion")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);

    }
}