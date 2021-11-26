package com.aor.numbers;

import java.util.List;

public interface GenericListDeduplicator {

    public List<Integer> deduplicate(List<Integer> list);
    public List<Integer> deduplicate(List<Integer> list, GenericListSorter deduplicator);


}
