import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;
        int actual = service.calcSum(managerSales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldCalcAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 15;
        int actual = service.findAvg(managerSales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        int actual = service.findMaxMonth(managerSales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] managerSales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        int actual = service.findMinMonth(managerSales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindAmountMonthMinAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAmountMonthMinAvg(managerSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindAmountMonthMixAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAmountMonthMaxAvg(managerSales);
        assertEquals(expected, actual);
    }
}