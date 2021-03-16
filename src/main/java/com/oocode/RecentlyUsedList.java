package com.oocode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList {
    private List<String> list;

    public RecentlyUsedList() {
        this.list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public void addItem(final String item) {
       if (!list.contains(item)) {
           list.add(0, item);
       }
    }

    public String get(final int index){
        return list.get(index);
    }


    public int size() {
        return this.list.size();
    }
}

