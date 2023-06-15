package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CashbackHackServiceTest {

    @Test
    public void amountIsGreaterBoundary () { //Тест, если сумма превышает границу
        CashbackHackService service = new CashbackHackService ();

        Assertions.assertEquals(500, service.remain(1500));
    }

    @Test
    public void amountIsEqualBoundary () { //сумма равна границе
        CashbackHackService service = new CashbackHackService ();

        Assertions.assertEquals(0,service.remain(1000));
    }
    @Test
    public void amountIsLessBoundary (){ // сумма меньше границы
        CashbackHackService service = new CashbackHackService ();

        Assertions.assertEquals(200, service.remain(800));

    }

}
