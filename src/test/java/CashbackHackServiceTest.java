package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void BoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected =0;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void BelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void AboveBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }
}
