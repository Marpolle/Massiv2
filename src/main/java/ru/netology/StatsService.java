package ru.netology;

public class StatsService {
    //Сумма всех продаж

    public int sumOfAllSales(long[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = (int) (summa + sales[i]);
        }
        return summa;
    }

    // средняя сумма продаж в месяц
    public int averageSalesMonth(long[] sales) {
        int summa = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = (int) (summa + sales[i]);
        }
        return summa = summa / sales.length;
    }
    //номер месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }


    //номер месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(long[] sales) {
        long SumMonth = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                SumMonth = SumMonth + 1;
            }
        }
        return (int) SumMonth;
    }


    //количество месяцев, в которых продажи были выше среднего
    public int salesHigherAverage(long[] sales) {
        long SumMonths = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                SumMonths = SumMonths + 1;
            }
        }
        return (int) SumMonths;
    }
}


