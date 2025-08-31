package programas;
import java.util.Scanner;
public class Compra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cliente;
        double tc = 0, pc, precio;
        int opcion;
        
        System.out.println("Bienvenido a la tienda virtual supermercado");
        System.out.print("Registre su nombre: ");
        cliente = sc.next();
        
        for (int i=0; i < 3; i++){
            System.out.println("Seleccione un producto de su interes");
            System.out.println("1. Leche");
            System.out.println("2. Carne");
            System.out.println("3. Gaseosa");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    precio = 12;
                    tc += precio;
                }
                case 2 -> {
                    precio = 20;
                    tc += precio;
                }
                case 3 -> {
                    precio = 8;
                    tc += precio;
                }
                default -> {
                    System.out.println("Programa Finalizado.");
                    break;
                }
            }
        }
        //Operaciones
        pc = tc / 3;
        
        //Resultados
        System.out.println("Factura de: " + cliente);
        System.out.println("Total de Compras: " + tc);
        System.out.print("Promedio de compra: ");
        System.out.printf("%.2f\n", pc);
        System.out.println("Fin del Proceso");
    }
}
