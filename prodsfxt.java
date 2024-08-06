import java.util.Scanner;

public class ConversorNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String opcion;

        System.out.println("Bienvenido al conversor de números.");
        System.out.println("Ingrese un número en decimal: ");
        numero = scanner.nextInt();

        System.out.println("Seleccione la conversión:");
        System.out.println("1. Decimal a Binario");
        System.out.println("2. Decimal a Hexadecimal");
        System.out.println("3. Binario a Decimal");
        System.out.println("4. Hexadecimal a Decimal");
        System.out.print("Opción: ");
        opcion = scanner.next();

        switch (opcion) {
            case "1":
                System.out.println("Decimal " + numero + " en Binario: " + Integer.toBinaryString(numero));
                break;
            case "2":
                System.out.println("Decimal " + numero + " en Hexadecimal: " + Integer.toHexString(numero).toUpperCase());
                break;
            case "3":
                System.out.print("Ingrese el número en binario: ");
                String binario = scanner.next();
                System.out.println("Binario " + binario + " en Decimal: " + Integer.parseInt(binario, 2));
                break;
            case "4":
                System.out.print("Ingrese el número en hexadecimal: ");
                String hexadecimal = scanner.next();
                System.out.println("Hexadecimal " + hexadecimal + " en Decimal: " + Integer.parseInt(hexadecimal, 16));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
