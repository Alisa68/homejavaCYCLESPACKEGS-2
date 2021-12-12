package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSumSales(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMaxSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calculateMaxSale(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calculateMinSale(sale);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMediumQuantityMonthMin() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMediumQuantityMonthMin(sale);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMediumQuantityMonthMax() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateMediumQuantityMonthMin(sale);
        assertEquals(expected, actual);
    }
}