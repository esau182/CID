
import java.util.ArrayList;
import java.util.List;

public class SimpleLinearRegression {
    private List<DataPoint> dataPoints;
    private double beta0; 
    private double beta1;  

    public SimpleLinearRegression() {
        this.dataPoints = new ArrayList<>();
    }

    // Añadir puntos al dataset
    public void addDataPoint(DataPoint dp) {
        this.dataPoints.add(dp);
    }

    // Método para calcular beta0 y beta1
    public void calcular() {
        int n = dataPoints.size();
        if (n == 0) {
            throw new RuntimeException("No hay datos");
        }

        double sumX = 0.0;
        double sumY = 0.0;
        double sumXY = 0.0;
        double sumX2 = 0.0;

        for (DataPoint dp : dataPoints) {
            double x = dp.getAdvertising();
            double y = dp.getSales();
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        // 1) Calcular beta1
        beta1 = (n * sumXY - sumX * sumY)
        / (n * sumX2 - (sumX * sumX));

        // 2) Calcular beta0
        beta0 = ((sumX2 * sumY) - (sumX * sumXY)) 
        / (n * sumX2 - (sumX * sumX));
    }

    public double getBeta0() {
        return beta0;
    }

    public double getBeta1() {
        return beta1;
    }

    // Predecir la Sales para un valor dado de Advertising
    public double predict(double advertising) {
        return beta0 + beta1 * advertising;
    }
}

