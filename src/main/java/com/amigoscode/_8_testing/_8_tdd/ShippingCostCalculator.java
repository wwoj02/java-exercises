package com.amigoscode._8_testing._8_tdd;

/**
 * TDD Exercise: Shipping Cost Calculator
 *
 * This class is intentionally EMPTY. Students should:
 * 1. First write tests in ShippingCostCalculatorTest.java (test-first approach)
 * 2. Then implement this class to make the tests pass
 *
 * Shipping rules to implement:
 * - Domestic shipping: $5.00 base + $0.50 per kg
 * - International shipping: $15.00 base + $1.50 per kg
 * - Weight of 0 kg = free shipping ($0.00)
 * - Negative weight should throw IllegalArgumentException
 * - Null destination should throw IllegalArgumentException
 * - Heavy package surcharge: weight > 50 kg adds $25.00 extra
 */
public class ShippingCostCalculator {

    /**
     * Calculates the shipping cost based on weight and destination.
     *
     * @param weight      the weight of the package in kilograms
     * @param destination "domestic" or "international"
     * @return the total shipping cost
     * @throws IllegalArgumentException if weight is negative or destination is null
     */
    public double calculate(double weight, String destination) {
        double perKg = 0.0;
        double base = 0.0;

        if (destination == null || weight < 0) throw new IllegalArgumentException();

        if (weight == 0) return 0.0;

        if (destination.equals("domestic")) {
            perKg = weight * 0.50;
            base = 5.00;
        }

        if (destination.equals("international")) {
            perKg = weight * 1.50;
            base = 15.00;
        }

        if (weight > 50) base += 25;

        return base + perKg;
    }
}
