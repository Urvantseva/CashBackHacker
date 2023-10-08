package ru.netology.CashBackHacker;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.Test
    public void testMoreBoundaries() {

        int amount = 1500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void CalculateIfTheAmountIsLessThan1000() {

        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void CalculateIfTheAmountIs1000() {

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }
}
