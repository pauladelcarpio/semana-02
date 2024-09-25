
package progrma;
import java.util.Scanner ;
public class ejercicio01 {
    public static void main(String[] args) {
        
        double[] ventas = new double[6];
        double totalVentas = 0;
        double promedioVentas;
        
       
        Scanner input = new Scanner(System.in);
        
       
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese la venta " + (i + 1) + ": ");
            ventas[i] = input.nextDouble();
            totalVentas += ventas[i]; // Sumar la venta al total
        }
        
       
        promedioVentas = totalVentas / 6;
        
        
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}

