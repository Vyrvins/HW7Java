package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales) {

        int sumSales = 0;//переменная для расчета суммы всех чисел массива

        for (long sale : sales) {
            //sale - продажа в рассматриваемом месяце
            //sales - все продажи
            sumSales += sale;//поочередно суммируем продажи в каждом новом месяце
        }
        return sumSales;
    }

    public long averageSumOfSales(long[] sales) {

        long averageSum = 0;//переменная для среднего значения суммы продаж
        long sumSales = sumOfSales(sales);//переменная для расчета суммы всех чисел массива

        for (long sale : sales) {
            averageSum = sumSales / sales.length;
        }
        return averageSum;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце max Month
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lessAverage(long[] sales) {

        int count = 0; //счетчик кол-ва месяцев с продажами риже среднего
        long average = averageSumOfSales(sales); // переменная среднего значения продаж

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int moreAverage(long[] sales) {

        int count = 0; //счетчик кол-ва месяцев с продажами риже среднего
        long average = averageSumOfSales(sales); // переменная среднего значения продаж

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}





