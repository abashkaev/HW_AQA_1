package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void amountIsGreaterBoundary() { //Тест, если сумма превышает границу
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void amountIsEqualBoundary() { //сумма равна границе
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void amountIsLessBoundary() { // сумма меньше границы
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}
