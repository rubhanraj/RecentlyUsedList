package com.oocode;

import org.junit.Assert;
import org.junit.Test;

public class RecentlyUsedListTest {

    @Test
    public void shouldBeEmpty() {
        Assert.assertTrue(new RecentlyUsedList().isEmpty());
    }
}