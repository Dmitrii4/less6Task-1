package ru.netology;

public class StatisticsService {
    public int calculateSum(int[] purchases) {
        int calculateSum = 0;
        for (int purchase : purchases) {
            calculateSum += purchase ;
        }
        return calculateSum;
    }

    public int averageSalesPerMonth(int[] purchases){
        int calculateSum = (int) calculateSum(purchases);

        int amount = purchases.length;

        int avarege = calculateSum / amount ;

        return avarege ;
    }

    public int lastMonthWithMaximumSales(int[] purchases) {
        int currentMax = purchases[0] ;
        int currentMonth = 0 ;
        int lastMonthWithMaximumSales = 0 ;
        for (int purchase : purchases) {
            currentMonth = currentMonth + 1 ;
            if (currentMax <= purchase){
                currentMax = purchase ;
                lastMonthWithMaximumSales = currentMonth ;
            }
        }
        return lastMonthWithMaximumSales ;
    }

    public int lastMonthWithMinimumSales(int[] purchases) {
        int currentMin = purchases[0] ;
        int currentMonth = 0 ;
        int lastMonthWithMinimumSales = 0 ;
        for (int purchase : purchases) {
            currentMonth = currentMonth + 1 ;
            if (currentMin >= purchase){
                currentMin = purchase ;
                lastMonthWithMinimumSales = currentMonth ;
            }
        }
        return lastMonthWithMinimumSales ;
    }

    public int amountOfMonthsWithBelowAverageSales(int[] purchases) {

        int averageSalesPerMonth = averageSalesPerMonth(purchases);
        int amountOfMonthsWithBelowAverageSales = 0 ;
        for (int purchase : purchases) {
            if (averageSalesPerMonth > purchase){
                amountOfMonthsWithBelowAverageSales = amountOfMonthsWithBelowAverageSales + 1;
            }
        }
        return amountOfMonthsWithBelowAverageSales ;
    }
    public int amountOfMonthsWithWhichAverageSales(int[] purchases) {

        int averageSalesPerMonth = averageSalesPerMonth(purchases);
        int amountOfMonthsWithWhichAverageSales = 0 ;
        for (int purchase : purchases) {
            if (averageSalesPerMonth > purchase){
                amountOfMonthsWithWhichAverageSales = amountOfMonthsWithWhichAverageSales + 1;
            }
        }
        return amountOfMonthsWithWhichAverageSales ;
    }
}
