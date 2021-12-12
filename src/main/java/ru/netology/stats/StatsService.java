package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sumsales = 0;
        for (int sale : sales) {
            sumsales += sale;
        }
        return sumsales;
    }

    public int calculateAverageSum(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int calculateMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int calculateMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int calculateMediumQuantityMonthMin(int[] sales) {
        int month = 0;

        for (int sale : sales) {
            if (sale < calculateAverageSum(sales)) {
                month += 1;
            }
        }
        return month;
    }

    public int calculateMediumQuantityMonthMax(int[] sales) {
        int month = 0;

        for (int sale : sales) {
            if (sale < calculateAverageSum(sales)) {
                month += 1;
            }
        }
        return month;

    }
}
