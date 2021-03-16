package com.oocode;

import org.junit.Assert;
import org.junit.Test;

public class RecentlyUsedListTest {

    @Test
    public void shouldBeEmpty() {
        Assert.assertTrue(new RecentlyUsedList().isEmpty());
    }

    @Test
    public void shouldAddNewItem() {
        final RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("some number");

        Assert.assertFalse(list.isEmpty());
    }


}