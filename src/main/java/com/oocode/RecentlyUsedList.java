package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    private List<String> list;

    public RecentlyUsedList() {
        this.list = new ArrayList<>();

    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void addItem(final String item) {
        list.add(item);
    }


}
