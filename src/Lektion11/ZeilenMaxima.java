package Lektion11;

public class ZeilenMaxima {
    public double[] zeilenMaxima(double[][] matrix){
        double[] maxima = new double[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            maxima[i] = matrix[i][0];
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] > maxima[i]){
                    maxima[i] = matrix[i][j];
                }
            }
        }
        return maxima;
    }
}
