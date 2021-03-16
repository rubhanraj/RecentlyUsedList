package com.oocode;

import org.junit.Assert;
import org.junit.Test;

public class RecentlyUsedListTest {

    @Test
    public void shouldBeEmpty() {
        final RecentlyUsedList list = new RecentlyUsedList();

        Assert.assertTrue(new RecentlyUsedList().isEmpty());
        Assert.assertEquals(list.size(), 0);

    }

    @Test
    public void shouldAddNewItem() {
        final RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("123456");

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(list.size(), 1);

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
        Assert.assertEquals(list.size(), 3);
    }

    @Test
    public void shouldNotHaveDuplicates() {
        final RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("1");
        list.addItem("1");

        Assert.assertEquals("1", list.get(0));
        Assert.assertNull(list.get(1));
    }
}