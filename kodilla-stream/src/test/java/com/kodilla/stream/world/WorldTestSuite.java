package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
//Given
        Country a1 = new Country("A1", new BigDecimal ("1000000000"));
        Country a2 = new Country("A2", new BigDecimal ("1000000000"));
        Country a3 = new Country("A3", new BigDecimal ("1000000000"));
        Country b1 = new Country("B1", new BigDecimal ("1000000000"));
        Country b2 = new Country("B2", new BigDecimal ("1000000000"));
        Country b3 = new Country("B3", new BigDecimal ("1000000000"));
        Country c1 = new Country("C1", new BigDecimal ("1000000000"));
        Country c2 = new Country("C2", new BigDecimal ("1000000000"));
        Country c3 = new Country("C3", new BigDecimal ("1000000000"));
        List<Country> countriesA = new ArrayList<>();
        countriesA.add(a1);
        countriesA.add(a2);
        countriesA.add(a3);
        List<Country> countriesB = new ArrayList<>();
        countriesB.add(b1);
        countriesB.add(b2);
        countriesB.add(b3);
        List<Country> countriesC = new ArrayList<>();
        countriesC.add(c1);
        countriesC.add(c2);
        countriesC.add(c3);
        Continent aaa = new Continent("AAA",countriesA);
        Continent bbb = new Continent("BBB",countriesB);
        Continent ccc = new Continent("CCC",countriesC);
        List<List<Country>> continents = new ArrayList<>();
        continents.add(countriesA);
        continents.add(countriesB);
        continents.add(countriesC);
        World world = new World();
        world.addContinent(aaa);
        world.addContinent(bbb);
        world.addContinent(ccc);
        //When
        BigDecimal actualQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("9000000000");
        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }
}
