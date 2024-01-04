package ru.netology.stats;

public class StatsService {
    // считаем сумму всех продаж
    public int getTotalSales(long[] monthlySales) {
        int totalSales = 0;
        for (long sale : monthlySales) {
            totalSales += sale;
        }
        return totalSales;
    }
    // средняя сумма продаж
    public double getAverageMonthlySales(long[] sales) {
        double averageMonthlySalesSum = 0;
        double totalSales = 0;

        totalSales = getTotalSales(sales);
        averageMonthlySalesSum = totalSales / sales.length;

        return averageMonthlySalesSum;
    }

    // номер месяца, в котором был пик проджаж
    public int findPeakMonthIndex(long[] sales) {
        int maxSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales [maxSale]) {
                maxSale = i;
            }
        }

        return maxSale + 1;
    }

    // номер месяца с минимальными продажами (из задачи)
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // количесвто месяцев, в которых продажи ниже СРЕДНЕГО
    public int belowThanAverage(long[] sales) {
        int belowAverageSales = 0;
        double averageMonthlySalesSum = getAverageMonthlySales(sales);

        for (long sale : sales) {
            if (sale < averageMonthlySalesSum) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    // количсевто месяцев, в которых продажи выше СРЕДНЕГО
    public int overThanAverage(long[] sales) {
        int overAverageSales = 0;
        double averageMonthlySalesSum = getAverageMonthlySales(sales);

        for (long sale : sales) {
            if (sale > averageMonthlySalesSum) {
                overAverageSales++;
            }
        }
        return overAverageSales;
    }
}
