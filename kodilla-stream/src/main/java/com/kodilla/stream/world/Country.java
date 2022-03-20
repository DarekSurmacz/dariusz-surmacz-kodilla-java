package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleStorage {
   private final String countryName;
   private final BigDecimal peopleQuantity;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
