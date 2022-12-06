public class StatsService {

    public int calcSum (int[] sales) {
        int sum = 0;
        for (int sale : sales){
            sum = sum + sale;
        }
        return sum;
    }

    public int findAvg (int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMaxMonth (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales){
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinMonth (int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findAmountMonthMinAvg (int[] sales) {
        int amountMonthMin = 0;
        int avg = calcSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avg) {
                amountMonthMin += 1;
            }
        }
        return amountMonthMin;
    }

    public int findAmountMonthMaxAvg (int[] sales) {
        int amountMonthMix = 0;
        int avg = calcSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avg) {
                amountMonthMix += 1;
            }
        }
        return amountMonthMix;
    }
}
