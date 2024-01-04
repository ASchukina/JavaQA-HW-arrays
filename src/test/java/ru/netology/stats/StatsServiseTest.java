package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class StatsServiseTest {

    @Test
    void getTotalSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getTotalSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getAverageMonthlySales() {
        StatsService service = new StatsService();
        double expected = 15;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.getAverageMonthlySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findPeakMonthIndex() {
        StatsService service = new StatsService();
        int expected = 8;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findPeakMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int expected = 9;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void belowThanAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowThanAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void overThanAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.overThanAverage(sales);

        assertEquals(expected, actual);
    }
}
