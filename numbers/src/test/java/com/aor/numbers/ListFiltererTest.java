package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private GenericListFilter positiveFilter = new PositiveFilter();
    private GenericListFilter divisibleByFilter = new DivisibleByFilter(2);

    @Test
    public void PositiveFilter() {
        List<Integer> testList = Arrays.asList(1, 0, -3, 17, 100, -8);
        List<Integer> expected = Arrays.asList(1, 17, 100);

        ListFilterer filterer = new ListFilterer(positiveFilter);
        List<Integer> filterList = filterer.filter(testList);

        Assertions.assertEquals(expected, filterList);
    }

    @Test
    public void DivisibleByFilter() {
        List<Integer> testList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 10, 11, 12, 20, 21, 24);
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 10, 12, 20, 24);

        ListFilterer filterer = new ListFilterer(divisibleByFilter);
        List<Integer> filterList = filterer.filter(testList);

        Assertions.assertEquals(expected, filterList);
    }

}
