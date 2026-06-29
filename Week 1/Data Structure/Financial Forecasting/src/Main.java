public class Main {
    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double pastGrowthRate = 0.05; 
        int periods = 10;             
        
        double futureValue = FinancialForecasting.calculateFutureValue(currentValue, pastGrowthRate, periods);
        
        System.out.println("--- Financial Forecasting ---");
        System.out.println("Current Value: $" + currentValue);
        System.out.println("Assumed Growth Rate: " + (pastGrowthRate * 100) + "%");
        System.out.println("Periods to Forecast: " + periods);
        System.out.printf("Predicted Future Value: $%.2f%n", futureValue);
    }
}
