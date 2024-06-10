package ru.netology.stats;

public class StatsService {


    //сумма всех продаж
    public long sumSales(long[] sales) {
        long sumAllSales = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sumAllSales = sumAllSales + sales[i];
        }

        return sumAllSales;
    }

    //средняя сумма продаж в месяц
    public long averageSumSales(long[] sales) {

        return sumSales(sales) / sales.length;
    }

    //номер месяца, c продажами на максимальную сумму
    public int mounthMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, c продажами на минимальную сумму
    public int mounthMinSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int monthUnderAverage(long[] sales) {
        int monthAmount = 0; // количество месяцев, в которых продажи были ниже среднего
        long averageSales = averageSumSales(sales); //средняя сумма продаж в месяц
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) { // значит, в рассматриваемом i-м месяце продаж меньше
                monthAmount++; // запомним его как минимальный
            }
        }

        return monthAmount;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int monthBeforeAverage(long[] sales) {
        int monthAmount = 0; // количество месяцев, в которых продажи были выше среднего
        long averageSales = averageSumSales(sales); //средняя сумма продаж в месяц
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) { // значит, в рассматриваемом i-м месяце продаж меньше
                monthAmount++; // запомним его как минимальный
            }
        }

        return monthAmount;
    }

}
