package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalcTest {
    /*@ParameterizedTest
    @CsvSource({
            "3,10_000,3_000,20_000",
            "2,100_000,60_000,150_000"
    })
    public void shouldCalculateVacationDays(int expected, int income, int expenses, int threshold) {
        VacationCalc service = new VacationCalc();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }*/
    @Test
    void shouldCalculateVacationDaysFirst() {
        VacationCalc service = new VacationCalc();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateVacationDaysSecond() {
        VacationCalc service = new VacationCalc();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
