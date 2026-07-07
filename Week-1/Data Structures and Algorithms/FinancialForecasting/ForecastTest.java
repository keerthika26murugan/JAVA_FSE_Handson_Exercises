public class ForecastTest {
    public static void main(String[] args) {
        FinancialForecasting tool = new FinancialForecasting();
        
        double principal = 1000.0; // Starting amount
        double rate = 0.05;        // 5% growth
        int years = 10;            // Forecast for 10 years

        double futureValue = tool.calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}