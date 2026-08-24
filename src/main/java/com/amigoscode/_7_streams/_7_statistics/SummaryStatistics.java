package com.amigoscode._7_streams._7_statistics;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Summary Statistics
 *
 * Learn how to use IntSummaryStatistics, DoubleSummaryStatistics,
 * and LongSummaryStatistics to compute multiple aggregate values
 * (count, sum, min, max, average) in a single pass.
 */
public class SummaryStatistics {

    record Sale(String product, double amount, int unitsSold) {}

    public static void main(String[] args) {
        List<Integer> scores = List.of(85, 92, 78, 95, 88, 73, 91, 82, 97, 76);

        List<Sale> sales = List.of(
                new Sale("Product A", 150.0, 10),
                new Sale("Product B", 200.0, 5),
                new Sale("Product C", 75.0, 20),
                new Sale("Product D", 300.0, 3),
                new Sale("Product E", 125.0, 12)
        );

        List<Integer> batch1 = List.of(10, 20, 30, 40, 50);
        List<Integer> batch2 = List.of(60, 70, 80, 90, 100);

        // TODO: 1 - Get IntSummaryStatistics from the 'scores' list
        //           Use mapToInt and summaryStatistics()
        //           Store the result in a variable
        IntSummaryStatistics summaryStatistics = scores.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(summaryStatistics);


        // TODO: 2 - Print the count, sum, min, max, and average from the
        //           IntSummaryStatistics obtained in TODO 1
        //           Use getCount(), getSum(), getMin(), getMax(), getAverage()
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());


        // TODO: 3 - Use the Collectors.summarizingInt() collector to get
        //           IntSummaryStatistics for unitsSold from 'sales'
        //           Print the result
        IntSummaryStatistics intSummaryStatistics = sales.stream()
                .collect(Collectors.summarizingInt(Sale::unitsSold));
        System.out.println(intSummaryStatistics);


        // TODO: 4 - Create DoubleSummaryStatistics for the sale amounts from 'sales'
        //           Use mapToDouble and summaryStatistics()
        //           Print all the statistics
        DoubleSummaryStatistics doubleSummaryStatistics = sales.stream()
                .mapToDouble(Sale::amount)
                .summaryStatistics();
        System.out.println(doubleSummaryStatistics);


        // TODO: 5 - Combine two IntSummaryStatistics:
        //           Create stats for 'batch1' and 'batch2' separately,
        //           then use the combine() method to merge them
        //           Print the combined statistics
        IntSummaryStatistics B1 = batch1.stream().collect(Collectors.summarizingInt(Integer::intValue));
        IntSummaryStatistics B2 = batch2.stream().collect(Collectors.summarizingInt(Integer::intValue));
        B1.combine(B2);
        System.out.println(B1);

    }
}
