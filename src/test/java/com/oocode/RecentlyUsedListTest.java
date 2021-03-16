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
        list.addItem("123456");

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void shouldGetItem() {
        final RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("123456");

        Assert.assertEquals("123456", list.get(0));
    }
}