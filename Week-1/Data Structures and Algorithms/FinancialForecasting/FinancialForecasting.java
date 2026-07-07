public class FinancialForecasting {

    // Recursive method to calculate future value
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case: If no years left, return current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: multiply current value by growth rate and call for years - 1
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}