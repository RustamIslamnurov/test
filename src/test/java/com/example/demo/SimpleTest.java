package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void test(){
        int x = 5;
        int y = 7;

        Assert.assertEquals(12, x+y);
        Assert.assertEquals(35, x*y);
    }
}