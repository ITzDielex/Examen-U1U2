
package examenu1u2;
import java.util.Scanner;

public class Examenu1u2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto 1:");
        String producto1Nombre = scanner.nextLine();
        System.out.print("Ingrese el precio original de " + producto1Nombre + ": ");
        double producto1PrecioOriginal = scanner.nextDouble();
        
        System.out.println("Ingrese el nombre del producto 2: ");
        scanner.nextLine();
        String producto2Nombre = scanner.nextLine();
        System.out.println("Ingrese el precio original de " + producto2Nombre + ": ");
        double producto2PrecioOriginal = scanner.nextDouble();
        
        System.out.println("Ingrese el nombre del producto 3: ");
        scanner.nextLine();
        String producto3Nombre = scanner.nextLine();
        System.out.println("Ingrese el precio original de " + producto3Nombre + ": ");
        double producto3PrecioOriginal = scanner.nextDouble();
        
        double descuentoProducto1 = 0.30 * producto1PrecioOriginal;
        double costoFinalProducto1 = producto1PrecioOriginal - descuentoProducto1;
        
        double descuentoProducto2 = 0.65 * producto2PrecioOriginal;
        double costoFinalProducto2 = producto2PrecioOriginal - descuentoProducto2;
        
        double descuentoProducto3 = 0.15 * producto3PrecioOriginal;
        double costoFinalProducto3 = producto3PrecioOriginal - descuentoProducto3;
        
        System.out.println("Costo final de " + producto1Nombre + ": $" + costoFinalProducto1);
        System.out.println("Costo final de " + producto2Nombre + ": $" + costoFinalProducto2);
        System.out.println("Costo final de " + producto3Nombre + ": $" + costoFinalProducto3);
        
        scanner.close();
    }
    
}
