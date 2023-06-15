package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void amountIsGreaterBoundary() { //Тест, если сумма превышает границу
        CashbackHackService service = new CashbackHackService();

        assertEquals(500, service.remain(1500));

    }

    @Test
    public void amountIsEqualBoundary() { //сумма равна границе
        CashbackHackService service = new CashbackHackService();

        assertEquals(0, service.remain(1000));
    }

    @Test
    public void amountIsLessBoundary() { // сумма меньше границы
        CashbackHackService service = new CashbackHackService();

        assertEquals(200, service.remain(800));

    }

}
