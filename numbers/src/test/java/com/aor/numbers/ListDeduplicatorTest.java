package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list; private List<Integer> expected;

    @BeforeEach
    private void helper(){
        list = Arrays.asList(1, 2, 4, 2);
        expected = Arrays.asList(1, 2, 4);
    }


    @Test
    public void deduplicate() {

        ListDeduplicator deduplicator = new ListDeduplicator();
        GenericListSorter listSorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(listSorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 2, 4));
        List<Integer> distinct = deduplicator.deduplicate(list, listSorter);

        Assertions.assertEquals(expected, distinct);
    }
}
