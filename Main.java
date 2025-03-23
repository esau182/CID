
public class Main {
    public static void main(String[] args) {

        // Crear el modelo de Regresión Lineal
        SimpleLinearRegression slr = new SimpleLinearRegression();

        // Agregar los datos(advertising, sales)
        slr.addDataPoint(new DataPoint(23, 651));
        slr.addDataPoint(new DataPoint(26, 762));
        slr.addDataPoint(new DataPoint(30, 856));
        slr.addDataPoint(new DataPoint(34, 1063));
        slr.addDataPoint(new DataPoint(43, 1190));
        slr.addDataPoint(new DataPoint(48, 1298));
        slr.addDataPoint(new DataPoint(52, 1421));
        slr.addDataPoint(new DataPoint(57, 1440));
        slr.addDataPoint(new DataPoint(58, 1518));

        // Calcular beta0 y beta1
        slr.calcular();

        double b0 = slr.getBeta0();
        double b1 = slr.getBeta1();

        // Imprimir la ecuación
        System.out.println("Ecuacion de Regresion Lineal Simple:");
        System.out.println("y= " + b0 + " + " + b1 + "x");
        System.out.println("Sales = " + b0 + " + " + b1 + " * Advertising");

        // Predicciones
        double[] nuevosAdvertising = {33, 24, 49, 50, 65};
        System.out.println("\nPredicciones para nuevos valores de Advertising:");
        for (double x : nuevosAdvertising) {
            double prediccion = slr.predict(x);
            System.out.println("Para el advertising = " + x + " el resultado de sales es = " + prediccion);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Trabajo realizado por: Esau Emmanuel Gonzalez Morquecho");
        System.out.println("Codigo: 219027791");
    }

}
