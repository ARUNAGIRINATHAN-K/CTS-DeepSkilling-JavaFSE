public class FinancialForecasting {
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue, growthRate, periods - 1) * (1 + growthRate);
    }
}
