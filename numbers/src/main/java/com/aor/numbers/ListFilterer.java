package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private final GenericListFilter filter;

    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();

        for (Integer elem: list) {
            if (filter.accept(elem)) returnList.add(elem);
        }
        return returnList;
    }
}
