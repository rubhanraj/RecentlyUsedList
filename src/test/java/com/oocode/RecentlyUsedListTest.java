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

    @Test
    public void shouldHaveRecentItemsTowardsTheStartOfTheList() {
        final RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("1");
        list.addItem("2");
        list.addItem("3");

        Assert.assertEquals("3", list.get(0));
        Assert.assertEquals("2", list.get(1));
        Assert.assertEquals("1", list.get(2));
    }
}