import ru.netology.stats.StatsService;


public class Main {
    public static void main(String[] args) {
        long[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stat = new StatsService();
        System.out.println("Сумма всех продаж: " + stat.sumSales(salesMonth));
        System.out.println("Среднюю сумма продаж в месяц: " + stat.averageSumSales(salesMonth));
        System.out.println("Номер месяца, c продажами на максимальную сумму: " + stat.mounthMaxSales(salesMonth));
        System.out.println("Номер месяца, c продажами на минимальную сумму: " + stat.mounthMinSales(salesMonth));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + stat.monthUnderAverage(salesMonth));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + stat.monthBeforeAverage(salesMonth));

    }
}
