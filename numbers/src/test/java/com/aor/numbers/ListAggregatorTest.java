package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
private List<Integer> list;

    @BeforeEach
    private void helper() {
        list = Arrays.asList(1, 2, 4, 2);
    }


    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(4, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {

        class StubListDuplicator implements GenericListDeduplicator{
            @Override
            public List<Integer> deduplicate(List<Integer> list){
                return Arrays.asList(1, 2, 4);
            }
        }

        ListAggregator aggregator = new ListAggregator();
        StubListDuplicator deduplicator = new StubListDuplicator();
        int distinct = aggregator.distinct(list, deduplicator);

        Assertions.assertEquals(3, distinct);
    }
}
