package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageSalesPerMonth() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSalesPerMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void lastMonthWithMaximumSales() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.lastMonthWithMaximumSales(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void lastMonthWithMinimumSales() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9 ;

        int actual = service.lastMonthWithMinimumSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void amountOfMonthsWithBelowAverageSales() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5 ;

        int actual = service.amountOfMonthsWithBelowAverageSales(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void amountOfMonthsWithWhichAverageSales() {
        StatisticsService service = new StatisticsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5 ;

        int actual = service.amountOfMonthsWithWhichAverageSales(purchases);

        assertEquals(expected, actual);
    }
}