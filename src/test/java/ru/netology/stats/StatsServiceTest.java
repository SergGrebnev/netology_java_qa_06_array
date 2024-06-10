package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 180;
        long actual = resultStats.sumSales(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSumSales() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 15;
        long actual = resultStats.averageSumSales(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMounthMaxSales() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 8;
        long actual = resultStats.mounthMaxSales(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMounthMinSales() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 9;
        long actual = resultStats.mounthMinSales(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthUnderAverage() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 5;
        long actual = resultStats.monthUnderAverage(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBeforeAverage() {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService resultStats = new StatsService();
        long expected = 5;
        long actual = resultStats.monthBeforeAverage(salesMonth);
        Assertions.assertEquals(expected, actual);
    }

}

