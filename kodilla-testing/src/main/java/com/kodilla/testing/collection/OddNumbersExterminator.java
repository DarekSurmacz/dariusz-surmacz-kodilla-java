package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> numbersWithoutOdds = new ArrayList<>();
        for (Integer even : numbers)
            if (even % 2 == 0) numbersWithoutOdds.add(even);
        return numbersWithoutOdds;
    }

}