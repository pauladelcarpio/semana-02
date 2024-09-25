
package progrma2;
import java.util.Scanner ;
public class ejercicsio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el capital inicial (va): ");
        double va = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés (en porcentaje): ");
        double tasaInteres = scanner.nextDouble();
        System.out.print("Ingrese el periodo en meses (n): ");
        int n = scanner.nextInt();
        double i = tasaInteres / 100;
        double vf = va * Math.pow((1 + i), n);
        double I = vf - va;
        
        System.out.printf("Valor Futuro (vf): %.2f%n", vf);
        System.out.printf("Interés ganado (I): %.2f%n", I);
        scanner.close();

    }
    
}
